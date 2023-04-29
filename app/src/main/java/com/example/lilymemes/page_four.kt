package com.example.lilymemes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class page_four : AppCompatActivity() {
    lateinit var button7: Button
    lateinit var button8: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page_four)
        button7=findViewById(R.id.button7)
        button8=findViewById(R.id.button8)
        button7.setOnClickListener {
            val intent= Intent(this,page_three::class.java)
            startActivity(intent)
        }
        button8.setOnClickListener {
            val intent= Intent(this,page_five::class.java)
            startActivity(intent)
        }
    }
}