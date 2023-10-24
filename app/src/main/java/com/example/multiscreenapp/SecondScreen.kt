package com.example.multiscreenapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_screen)
        val result:TextView=findViewById(R.id.text)
        val firstname=intent.getStringExtra("extra_firstname")
        val lastname=intent.getStringExtra("extra_lastname")

        result.text="my name is $firstname $lastname"

    }
}