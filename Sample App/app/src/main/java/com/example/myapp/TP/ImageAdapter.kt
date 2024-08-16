package com.example.myapp.TP

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.myapp.R

class ImageAdapter(val images: List<Int>, val imageClickHandler: ImageOnClickListener): RecyclerView.Adapter<ImageAdapter.ImageViewHolder>() {

    class ImageViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val imageView: ImageView = itemView.findViewById(R.id.image_view)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.image_item, parent, false)

        return ImageViewHolder(view)
    }

    override fun getItemCount(): Int {
        return images.size
    }

    override fun onBindViewHolder(holder: ImageViewHolder, position: Int) {
        val currentImageId = images[position]
        holder.imageView.setImageResource(currentImageId)
        holder.itemView.setOnClickListener {
            this.imageClickHandler.displayImageDetail(currentImageId)
        }
    }
}

interface ImageOnClickListener {
    fun displayImageDetail(imageId: Int)
}