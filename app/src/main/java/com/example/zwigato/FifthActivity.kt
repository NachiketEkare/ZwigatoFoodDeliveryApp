package com.example.zwigato

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class FifthActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fifth)

        supportActionBar?.hide()
        val Navcontroller = findNavController(R.id.fragmentContainerView5)
        val bottomnavigation = findViewById<BottomNavigationView>(R.id.bottomNavigationView3)
        bottomnavigation.setupWithNavController(Navcontroller)
    }
}