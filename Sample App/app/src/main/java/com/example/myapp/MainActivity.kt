package com.example.myapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    lateinit var centerTextView: TextView
    lateinit var secondTextView: TextView
    lateinit var goToSecondActivityBtn: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        // On peut relier les lateinit

        centerTextView = findViewById(R.id.center_text_textview)
        secondTextView = findViewById(R.id.second_text_textview)
        goToSecondActivityBtn = findViewById(R.id.go_to_seccond_activity_button)

        goToSecondActivityBtn.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("TEXT", "Center text for 2nd activity")
            startActivity(intent)
        }

        updateText()
    }

    private fun updateText() {
        centerTextView.text = "Center text updated"
        secondTextView.text = "Second text view content updated"
    }
}