package com.example.akbar_atakhodhzhaev_m3_hw6

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


data class Car(val modelName: String, val manufacturer: String, val year: Int)

class CustomAdapter(private val dataSet: Array<Car>) :
    RecyclerView.Adapter<CarViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CarViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_layout, parent, false)
        return CarViewHolder(view)
    }

    override fun onBindViewHolder(holder: CarViewHolder, position: Int) {
        holder.bind(dataSet[position])
    }

    override fun getItemCount(): Int {
        return dataSet.size
    }
}

class CarViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    private val textView: TextView = itemView.findViewById(R.id.textView)

    @SuppressLint("SetTextI18n")
    fun bind(car: Car) {
        textView.text = "${car.manufacturer} ${car.modelName} (${car.year})"
    }
}
//to update git
