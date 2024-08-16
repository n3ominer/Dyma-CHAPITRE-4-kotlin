package com.example.myapp.TP

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myapp.R

class ImageDetailActivity : AppCompatActivity() {

    lateinit var imageView: ImageView
    lateinit var languageTv: TextView

    private var imageId: Int = 0
    private lateinit var langName: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_image_detail)

        this.imageView = findViewById(R.id.detail_image_view)
        this.languageTv = findViewById(R.id.langage_name_tv)

        getDataFromIntent()

        this.imageView.setImageResource(imageId)

    }

    private fun getDataFromIntent() {
        intent?.let {
            this.imageId = it.getIntExtra("IMAGE_ID", 0)
            this.langName = it.getStringExtra("") ?: "--"
        }

    }
}