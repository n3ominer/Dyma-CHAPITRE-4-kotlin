package com.example.myapp.C4_L6

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myapp.C4_L6.data.CellData
import com.example.myapp.C4_L6.data.CellDataEnum
import com.example.myapp.R

const val CELL_TYPE_1 = 0
const val CELL_TYPE_2 = 1
const val CELL_TYPE_3 = 2

class RvAdapter(private val items: List<CellData>): RecyclerView.Adapter<RvViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RvViewHolder {
        /*val view = when(viewType) {
            CELL_TYPE_1 -> LayoutInflater.from(parent.context).inflate(R.layout.recycler_view_cell, parent, false)
            CELL_TYPE_2 -> LayoutInflater.from(parent.context).inflate(R.layout.recycler_view_cell_type2, parent, false)
            CELL_TYPE_3 -> LayoutInflater.from(parent.context).inflate(R.layout.recycler_view_cell_type3, parent, false)
            else -> LayoutInflater.from(parent.context).inflate(R.layout.recycler_view_cell, parent, false)
        }*/

        val view = LayoutInflater.from(parent.context).inflate(R.layout.recyclerview_grid_cell_card, parent, false)

        return RvViewHolder(view)
    }

    /*override fun getItemViewType(position: Int): Int {
        return when(this.items[position].type) {
            CellDataEnum.CELL_TYPE_1 -> CELL_TYPE_1
            CellDataEnum.CELL_TYPE_2 -> CELL_TYPE_2
            CellDataEnum.CELL_TYPE_3 -> CELL_TYPE_3
        }
    }*/

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: RvViewHolder, position: Int) {
        val currentCellData = this.items[position]
        holder.textView.text = currentCellData.content

    }
}

class RvViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
    var  textView: TextView = itemView.findViewById(R.id.cell_text)
}

