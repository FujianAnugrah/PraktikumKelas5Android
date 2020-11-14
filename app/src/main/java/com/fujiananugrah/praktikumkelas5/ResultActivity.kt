package com.fujiananugrah.praktikumkelas5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ResultActivity : AppCompatActivity() {
    companion object {
        final val EXTRA_NAME = "student_name"
        final val EXTRA_ID = "student_id"
        final val EXTRA_PHONE_NUMBER = "student_phone_number"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val tvStudentIdResult = findViewById<TextView>(R.id.tvStudentIdResult)
        val tvStudentNameResult = findViewById<TextView>(R.id.tvStudentNameResult)
        val tvStudentPhoneNumberResult = findViewById<TextView>(R.id.tvStudentPhoneNumberResult)

        val id = intent.getStringExtra(EXTRA_ID)
        val name = intent.getStringExtra(EXTRA_NAME)
        val phoneNumber = intent.getStringExtra(EXTRA_PHONE_NUMBER)

        tvStudentIdResult.text = id
        tvStudentNameResult.text = name
        tvStudentPhoneNumberResult.text = phoneNumber
    }
}