package com.fujiananugrah.praktikumkelas5

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class StudentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_student)

        val btSendStudent = findViewById<Button>(R.id.btSendStudent)
        val btDialStudent = findViewById<Button>(R.id.btDialStudent)
        val etIdStudent = findViewById<EditText>(R.id.etIdStudent)
        val etNameStudent = findViewById<EditText>(R.id.etNameStudent)
        val etPhoneNumberStudent = findViewById<EditText>(R.id.etPhoneNumberStudent)


        btSendStudent.setOnClickListener {

            val id = etIdStudent.text.toString()
            val name = etNameStudent.text.toString()
            val phoneNumber = etPhoneNumberStudent.text.toString()


            val i = Intent(this,ResultActivity::class.java)
            i.putExtra(ResultActivity.EXTRA_ID,id)
            i.putExtra(ResultActivity.EXTRA_NAME,name)
            i.putExtra(ResultActivity.EXTRA_PHONE_NUMBER,phoneNumber)
            startActivity(i)
        }

        btDialStudent.setOnClickListener {
            val phoneNumber = etPhoneNumberStudent.text.toString()
            val i = Intent(Intent.ACTION_DIAL, Uri.parse("tel:$phoneNumber"))
            startActivity(i)
        }
    }
}