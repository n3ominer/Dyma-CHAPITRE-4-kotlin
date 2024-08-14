package com.example.myapp.C4_L6

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myapp.R

class RvAdapter(private val items: List<String>): RecyclerView.Adapter<RvViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RvViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.recycler_view_cell, parent, false)

        return RvViewHolder(view)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: RvViewHolder, position: Int) {
        val currentText = this.items[position]
        holder.textView.text = currentText

    }
}

class RvViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
    var  textView: TextView = itemView.findViewById(R.id.cell_text)
}