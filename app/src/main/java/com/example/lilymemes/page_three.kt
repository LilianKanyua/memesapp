package com.example.lilymemes

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class page_three : AppCompatActivity() {
    lateinit var button5: Button
    lateinit var button6: Button
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page_three)
        button5=findViewById(R.id.button5)
        button6=findViewById(R.id.button6)
        button5.setOnClickListener {
            val intent= Intent(this,page_two::class.java)
            startActivity(intent)
        }
        button6.setOnClickListener {
            val intent= Intent(this,page_four::class.java)
            startActivity(intent)
        }

    }

//    button5.setOnClickListener {
//
//        val intent= Intent(this,page_four::class.java)
//        startActivity(intent)
//    }
}