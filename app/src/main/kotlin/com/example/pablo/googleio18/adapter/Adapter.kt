package com.example.pablo.googleio18.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.pablo.googleio18.R
import kotlinx.android.synthetic.main.vh_simple_item.view.*

class Adapter(val onClick: () -> Unit) : RecyclerView.Adapter<Adapter.ViewHolder>() {

    private var data = ArrayList<String>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.vh_simple_item, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int = data.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.itemView.setOnClickListener {
            onClick()
        }
        holder.itemView.textView.text = data[position]
    }

    fun add(item: String) {
        data.add(item)
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

}