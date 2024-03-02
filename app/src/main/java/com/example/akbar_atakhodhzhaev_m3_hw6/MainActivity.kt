package com.example.akbar_atakhodhzhaev_m3_hw6

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.akbar_atakhodhzhaev_m3_hw6.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val dataSet = arrayOf("Honda", "Nissan", "Toyota", "Mercedes", "BMW", "Audi","Volkswagen","Tvr","Land Rover","Mitsubishi")

        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        binding.recyclerView.adapter = CustomAdapter(dataSet)
    }
}
