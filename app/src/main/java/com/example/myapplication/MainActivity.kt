package com.example.myapplication


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout

import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.my_recycler_view)
        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL, false)

        val dataList = ArrayList<Model>()
        dataList.add(Model("Phone", 1))
        dataList.add(Model("Watch", 2))
        dataList.add(Model("Note", 3))
        dataList.add(Model("Pin", 4))

        val rvAdapter = RvAdapter(dataList)

        recyclerView.adapter = rvAdapter



    }
}
