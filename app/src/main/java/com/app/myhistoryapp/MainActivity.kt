package com.app.myhistoryapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etTitle = findViewById<TextView>(R.id.tvTitle).text

        val etText = findViewById<TextView>(R.id.etText).text
        val etAge = findViewById<EditText>(R.id.etAge)
        
        val btnGenerate = findViewById<Button>(R.id.btnGenerate)
        val btnClear = findViewById<Button>(R.id.btnClear)

        btnGenerate.setOnClickListener{
            val etText = etAge.text.toString()
            val etAge = etText.toInt()







        }

    }
}