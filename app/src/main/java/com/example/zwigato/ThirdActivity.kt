package com.example.zwigato

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ThirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)
        supportActionBar?.hide()
        val noAccount = findViewById<TextView>(R.id.textView12)

        noAccount.setOnClickListener {
            val intent = Intent(this,FourthActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}