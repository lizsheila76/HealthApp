package com.liz.yourhealth

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class DentistDepartmentActivity : AppCompatActivity() {
    lateinit var DTBack: Button
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dentist_department)

        DTBack=findViewById(R.id.buttonDTBack)

        DTBack.setOnClickListener {
            val intent= Intent(this,FindDoctorActivity::class.java)
            startActivity(intent)
        }
    }
}