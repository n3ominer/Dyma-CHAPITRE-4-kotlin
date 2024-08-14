package com.example.myapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ThirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_third)




        /*
        private lateinit var centerText: String
        private lateinit var centerTextView: TextView

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)

            enableEdgeToEdge()
            setContentView(R.layout.second_activity)

            centerTextView = findViewById(R.id.second_center_text_textview)

            getDataFromIntent()
            addFragment(savedInstanceState)

            this.centerTextView.text = centerText
        }

        fun getDataFromIntent() {
            if(this.intent != null) {
                this.centerText = this.intent.getStringExtra("TEXT") ?: "No text passed"
            }
        }
         */
    }
}