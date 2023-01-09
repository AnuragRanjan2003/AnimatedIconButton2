package com.example.animatediconbutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val animatedButton = findViewById<AnimatedButton>(R.id.btn)

        animatedButton.setOnClickListener {
            animatedButton.clicked()
        }
    }
}