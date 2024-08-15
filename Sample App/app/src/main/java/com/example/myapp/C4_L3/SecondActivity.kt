package com.example.myapp.C4_L3

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.myapp.R

class SecondActivity: AppCompatActivity() {

    private lateinit var linkButton: Button
    private lateinit var mailButton: Button

    private lateinit var centerText: String
    private lateinit var centerTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        enableEdgeToEdge()
        setContentView(R.layout.second_activity)


        linkButton = findViewById(R.id.open_link_browser_button)
        mailButton = findViewById(R.id.communication_apps_button)
        centerTextView = findViewById(R.id.second_center_text_textview)

        linkButton.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.google.com")
            startActivity(intent)
        }

        mailButton.setOnClickListener {
            val intent = Intent(Intent.ACTION_SEND).apply {
                type = "text/plain"
                putExtra(Intent.EXTRA_EMAIL, "toto@gmail.com")
                putExtra(Intent.EXTRA_SUBJECT, "Email demo subject")
                putExtra(Intent.EXTRA_TEXT, "Body")
            }
            startActivity(intent)
        }

        getDataFromIntent()
        addFragment(savedInstanceState)

        this.centerTextView.text = this.centerText
    }

    fun getDataFromIntent() {
        if(this.intent != null) {
            this.centerText = this.intent.getStringExtra("TEXT") ?: "No text passed"
        }
    }

    private fun addFragment(savedInstanceState: Bundle?) {
        if (savedInstanceState == null) {
            val fragManager = supportFragmentManager
            val transaction = fragManager.beginTransaction()
            transaction.add(R.id.fragment_container, MainFragment.newInstance("", ""))
            transaction.commit()
        }
    }

}