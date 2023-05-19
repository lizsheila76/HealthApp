package com.liz.yourhealth

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class PharmacyActivity : AppCompatActivity() {
    lateinit var DEBack: Button
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pharmacy)
        DEBack=findViewById(R.id.buttonDEBack)

        DEBack.setOnClickListener {
            val intent= Intent(this,FindDoctorActivity::class.java)
            startActivity(intent)
        }
    }
}