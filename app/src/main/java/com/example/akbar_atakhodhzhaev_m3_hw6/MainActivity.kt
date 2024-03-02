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

        val dataSet = arrayOf(
            Car("Civic", "Honda", 2022),
            Car("Altima", "Nissan", 2021),
            Car("Corolla", "Toyota", 2020),
            Car("E-Class", "Mercedes", 2023),
            Car("3 Series", "BMW", 2023),
            Car("A4", "Audi", 2022),
            Car("Golf", "Volkswagen", 2022),
            Car("Griffith", "Tvr", 2021),
            Car("Range Rover", "Land Rover", 2022),
            Car("Outlander", "Mitsubishi", 2021)
        )

        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        binding.recyclerView.adapter = CustomAdapter(dataSet)
    }
}
