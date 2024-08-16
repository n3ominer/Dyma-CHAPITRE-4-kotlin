package com.example.myapp.TP

import android.content.Intent
import android.os.Bundle
import android.widget.ToggleButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapp.R

class ImageGalleryActivity : AppCompatActivity(), ImageOnClickListener {

    lateinit var imagesRv: RecyclerView
    lateinit var toggle: ToggleButton

    private var isGrid = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_image_gallery)

        this.imagesRv = findViewById(R.id.images_recycler_view)
        this.toggle = findViewById(R.id.list_display_behavior_toggle)

        this.toggle.setOnClickListener {
            this.isGrid = !isGrid
            setupRecyclerView()
        }

        setupRecyclerView()
    }

    fun setupRecyclerView() {
        val images = listOf(
            R.drawable.android,
            R.drawable.swift,
            R.drawable.flutter,
            R.drawable.vuejs,
            R.drawable.gradle,
            R.drawable.react,
            R.drawable.android,
            R.drawable.nature_1,
            )

        this.imagesRv.layoutManager = if(this.isGrid) {
            GridLayoutManager(this, 2)
        } else {
            LinearLayoutManager(this)
        }
        this.imagesRv.adapter = ImageAdapter(images, this)
    }

    override fun displayImageDetail(imageId: Int) {
        val intent = Intent(this, ImageDetailActivity::class.java)
        intent.putExtra("IMAGE_ID", imageId)
        startActivity(intent)
    }
}