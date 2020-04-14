package com.example.myapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RvAdapter(val userList: ArrayList<Model>) : RecyclerView.Adapter<RvAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val v = LayoutInflater.from(parent?.context).inflate(R.layout.adapter_item_layout, parent, false)
        return ViewHolder(v);
    }

    override fun getItemCount(): Int {

        return userList.size
    }

    override fun onBindViewHolder(holder: RvAdapter.ViewHolder, position: Int) {

        holder.name?.text = userList[position].name
        holder.count?.text = userList[position].count.toString()
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val name = itemView.findViewById<TextView>(R.id.tvName)
        val count = itemView.findViewById<TextView>(R.id.tvCount)
    }
}


