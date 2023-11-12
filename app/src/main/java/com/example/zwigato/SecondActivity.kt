package com.example.zwigato

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        supportActionBar?.hide()

        val button = findViewById<Button>(R.id.button)

        button.setOnClickListener {
            val intent = Intent(this,ThirdActivity::class.java)
            startActivity(intent)
            finish()
        }

    }
}