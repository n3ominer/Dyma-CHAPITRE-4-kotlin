package com.example.myapp.C4_L4

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapp.C4_L6.RvAdapter
import com.example.myapp.C4_L6.data.CellData
import com.example.myapp.C4_L6.data.CellDataEnum
import com.example.myapp.R
import kotlin.random.Random
import kotlin.random.nextInt

class MainActivityL4 : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main_l4)

        this.recyclerView = findViewById(R.id.recycler_view)
        setUpRecyclerView()
    }

    private fun setUpRecyclerView() {
        this.recyclerView.layoutManager = GridLayoutManager(this, 2) //LinearLayoutManager(this)
        val data = listOf("Ramzy", "Arthur", "Alex", "Julie", "Ahmed", "Ramzy", "Arthur", "Alex", "Julie", "Ahmed", "Ramzy", "Arthur", "Alex", "Julie", "Ahmed")
        val cells = data.map {
            this.createCellData(it)
        }
        recyclerView.adapter = RvAdapter(cells)
    }

    private fun createCellData(name: String): CellData {
        return CellData(name, CellDataEnum.entries[Random.nextInt(CellDataEnum.entries.size)])
    }
}