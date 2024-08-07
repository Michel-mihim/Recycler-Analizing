package com.practicum.recyclerview_lesson_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val colors_list = listOf(R.color.color1, R.color.color2, R.color.color3, R.color.color4, R.color.color5,
            R.color.color6, R.color.color7, R.color.color8, R.color.color9, R.color.color10)

        val recyclerView = findViewById<RecyclerView>(R.id.colorBoxesRecycler)
        recyclerView.adapter = ColorBoxAdapter(
            colorBoxes = List(500) {
                ColorBox(colors_list[it % 10], ((it % 10)+1).toString(), "2")
            }
        )
//        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
          recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
//        recyclerView.layoutManager = GridLayoutManager(this, 3, GridLayoutManager.VERTICAL, false)
    }
}