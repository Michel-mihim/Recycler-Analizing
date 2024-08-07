package com.practicum.recyclerview_lesson_2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

data class ColorBox(val value: Int, val label1: String, val label2: String)

class ColorBoxAdapter(
    private val colorBoxes: List<ColorBox>
) : RecyclerView.Adapter<ColorBoxAdapter.ColorBoxViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ColorBoxViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.color_box_view, parent, false)
        return ColorBoxViewHolder(view)
    }

    override fun onBindViewHolder(holder: ColorBoxViewHolder, position: Int) {
        holder.bind(colorBoxes[position])
    }

    override fun getItemCount() = colorBoxes.size


    class ColorBoxViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val firstTextView: TextView
        private val secondTextView: TextView
        //private val secondTextView: TextView

        init {
            firstTextView = itemView.findViewById(R.id.element1)
            secondTextView = itemView.findViewById(R.id.element2)
        }

        fun bind(colorBox: ColorBox) {
            firstTextView.setBackgroundColor(itemView.context.getColor(colorBox.value))
            firstTextView.text = colorBox.label1


        }
    }
}