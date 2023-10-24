package com.example.multiscreenapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val firstname:EditText=findViewById(R.id.edt_first_name)
        val lastname:EditText=findViewById(R.id.edt_last_name)
        val swapbtn:Button=findViewById(R.id.button1)

        swapbtn.setOnClickListener{
            val firstnameval=firstname.text.toString()
            val lastnameval=lastname.text.toString()
            val intent123=Intent(this,SecondScreen::class.java)
            intent123.putExtra("extra_firstname",firstnameval)
            intent123.putExtra("extra_lastname",lastnameval)
            startActivity(intent123)
        }
    }
}