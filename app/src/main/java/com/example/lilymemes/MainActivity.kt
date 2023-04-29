package com.example.lilymemes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var button2:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button2=findViewById(R.id.button2)
        button2.setOnClickListener {
            val intent=Intent(this,page_two::class.java)
            startActivity(intent)
        }

    }
}