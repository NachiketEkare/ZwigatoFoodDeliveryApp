package com.example.zwigato

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class FourthActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fourth)
        supportActionBar?.hide()
        val alreadyAccount = findViewById<TextView>(R.id.textView16)
        val createaccount = findViewById<Button>(R.id.button7)
        createaccount.setOnClickListener {
            val intent = Intent(this,FifthActivity::class.java)
            startActivity(intent)
            finish()
        }

        alreadyAccount.setOnClickListener {
            val intent = Intent(this,ThirdActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}