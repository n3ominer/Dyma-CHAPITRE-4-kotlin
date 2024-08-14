package com.example.myapp.C4_L3

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.myapp.R

class SecondActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        enableEdgeToEdge()
        setContentView(R.layout.second_activity)

        addFragment(savedInstanceState)
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