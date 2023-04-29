package com.example.lilymemes

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class page_two : AppCompatActivity() {
    lateinit var button3: Button
    lateinit var button4: Button
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page_two2)
        button3=findViewById(R.id.button3)
        button4=findViewById(R.id.button4)
        button3.setOnClickListener {
            val intent= Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
        button4.setOnClickListener {
            val intent= Intent(this,page_three::class.java)
            startActivity(intent)
        }

    }
}