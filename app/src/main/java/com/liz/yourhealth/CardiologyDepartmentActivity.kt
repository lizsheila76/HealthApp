package com.liz.yourhealth

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class CardiologistActivity : AppCompatActivity() {
    lateinit var CABack: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cardiology_department)

        CABack=findViewById(R.id.ButtonCABack)

        CABack.setOnClickListener {
            val intent= Intent(this,FindDoctorActivity::class.java)
            startActivity(intent)
        }


    }
}