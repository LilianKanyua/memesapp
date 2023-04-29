package com.example.lilymemes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class page_five : AppCompatActivity() {
    lateinit var button9: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page_five)
        button9=findViewById(R.id.button9)
        button9.setOnClickListener {
            val intent= Intent(this,page_four::class.java)
            startActivity(intent)
        }
    }
}