package com.example.myapp.C4_L4

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapp.C4_L6.RvAdapter
import com.example.myapp.R

class MainActivityL4 : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main_l4)

        this.recyclerView = findViewById(R.id.recycler_view)
        setUpRecyclerView()
    }

    private fun setUpRecyclerView() {
        this.recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = RvAdapter(listOf("Ramzy", "Arthur", "Alex", "Julie", "Ahmed", "Ramzy", "Arthur", "Alex", "Julie", "Ahmed", "Ramzy", "Arthur", "Alex", "Julie", "Ahmed"))
    }
}