package com.example.disasterapp

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.disasterapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val listData = generateDummy()
        val disasterAdapter = DisasterAdapter(listData) {
            disaster ->
            Toast.makeText(
                this@MainActivity,
                "You click on ${disaster.nameDisaster}",
                Toast.LENGTH_SHORT).show()
        }

        with(binding) {
            rvDisaster.apply {
                adapter = disasterAdapter
                layoutManager = GridLayoutManager(this@MainActivity, 3)
            }
        }

    }
        fun generateDummy() : List<Disaster> {
            return listOf(
                Disaster(nameDisaster = "Tsunami", disasterType = "Natural"),
                Disaster(nameDisaster = "Volcanic Eruption", disasterType = "Natural"),
                Disaster(nameDisaster = "Earthquake", disasterType = "Natural"),
                Disaster(nameDisaster = "Flood", disasterType = "Natural"),
                Disaster(nameDisaster = "Fire", disasterType = "Natural"),
                Disaster(nameDisaster = "Nuclear Accident", disasterType = "Man-made"),
                Disaster(nameDisaster = "Terrorist Attack", disasterType = "Man-made"),
                Disaster(nameDisaster = "War", disasterType = "Man-made"),
                Disaster(nameDisaster = "Tsunami", disasterType = "Natural"),
                Disaster(nameDisaster = "Volcanic Eruption", disasterType = "Natural"),
                Disaster(nameDisaster = "Earthquake", disasterType = "Natural"),
                Disaster(nameDisaster = "Flood", disasterType = "Natural"),
                Disaster(nameDisaster = "Fire", disasterType = "Natural"),
                Disaster(nameDisaster = "Nuclear Accident", disasterType = "Man-made"),
                Disaster(nameDisaster = "Terrorist Attack", disasterType = "Man-made"),
                Disaster(nameDisaster = "War", disasterType = "Man-made"),
                Disaster(nameDisaster = "Tsunami", disasterType = "Natural"),
                Disaster(nameDisaster = "Volcanic Eruption", disasterType = "Natural"),
                Disaster(nameDisaster = "Earthquake", disasterType = "Natural"),
                Disaster(nameDisaster = "Flood", disasterType = "Natural"),
                Disaster(nameDisaster = "Fire", disasterType = "Natural"),
                Disaster(nameDisaster = "Nuclear Accident", disasterType = "Man-made"),
                Disaster(nameDisaster = "Terrorist Attack", disasterType = "Man-made"),
                Disaster(nameDisaster = "War", disasterType = "Man-made"),
                Disaster(nameDisaster = "Tsunami", disasterType = "Natural"),
                Disaster(nameDisaster = "Volcanic Eruption", disasterType = "Natural"),
                Disaster(nameDisaster = "Earthquake", disasterType = "Natural"),
                Disaster(nameDisaster = "Flood", disasterType = "Natural"),
                Disaster(nameDisaster = "Fire", disasterType = "Natural"),
                Disaster(nameDisaster = "Nuclear Accident", disasterType = "Man-made"),
                Disaster(nameDisaster = "Terrorist Attack", disasterType = "Man-made"),
                Disaster(nameDisaster = "War", disasterType = "Man-made"),
                Disaster(nameDisaster = "Tsunami", disasterType = "Natural"),
                Disaster(nameDisaster = "Volcanic Eruption", disasterType = "Natural"),
                Disaster(nameDisaster = "Earthquake", disasterType = "Natural"),
                Disaster(nameDisaster = "Flood", disasterType = "Natural"),
                Disaster(nameDisaster = "Fire", disasterType = "Natural"),
                Disaster(nameDisaster = "Nuclear Accident", disasterType = "Man-made"),
                Disaster(nameDisaster = "Terrorist Attack", disasterType = "Man-made"),
                Disaster(nameDisaster = "War", disasterType = "Man-made"),
                Disaster(nameDisaster = "Tsunami", disasterType = "Natural"),
                Disaster(nameDisaster = "Volcanic Eruption", disasterType = "Natural"),
                Disaster(nameDisaster = "Earthquake", disasterType = "Natural"),
                Disaster(nameDisaster = "Flood", disasterType = "Natural"),
                Disaster(nameDisaster = "Fire", disasterType = "Natural"),
                Disaster(nameDisaster = "Nuclear Accident", disasterType = "Man-made"),
                Disaster(nameDisaster = "Terrorist Attack", disasterType = "Man-made"),
                Disaster(nameDisaster = "War", disasterType = "Man-made"),
                Disaster(nameDisaster = "Tsunami", disasterType = "Natural"),
                Disaster(nameDisaster = "Volcanic Eruption", disasterType = "Natural"),
                Disaster(nameDisaster = "Earthquake", disasterType = "Natural"),
                Disaster(nameDisaster = "Flood", disasterType = "Natural"),
                Disaster(nameDisaster = "Fire", disasterType = "Natural"),
                Disaster(nameDisaster = "Nuclear Accident", disasterType = "Man-made"),
                Disaster(nameDisaster = "Terrorist Attack", disasterType = "Man-made"),
                Disaster(nameDisaster = "War", disasterType = "Man-made"),
                Disaster(nameDisaster = "Tsunami", disasterType = "Natural"),
                Disaster(nameDisaster = "Volcanic Eruption", disasterType = "Natural"),
                Disaster(nameDisaster = "Earthquake", disasterType = "Natural"),
                Disaster(nameDisaster = "Flood", disasterType = "Natural"),
                Disaster(nameDisaster = "Fire", disasterType = "Natural"),
                Disaster(nameDisaster = "Nuclear Accident", disasterType = "Man-made"),
                Disaster(nameDisaster = "Terrorist Attack", disasterType = "Man-made"),
                Disaster(nameDisaster = "War", disasterType = "Man-made"),
                Disaster(nameDisaster = "Tsunami", disasterType = "Natural"),
                Disaster(nameDisaster = "Volcanic Eruption", disasterType = "Natural"),
                Disaster(nameDisaster = "Earthquake", disasterType = "Natural"),
                Disaster(nameDisaster = "Flood", disasterType = "Natural"),
                Disaster(nameDisaster = "Fire", disasterType = "Natural"),
                Disaster(nameDisaster = "Nuclear Accident", disasterType = "Man-made"),
                Disaster(nameDisaster = "Terrorist Attack", disasterType = "Man-made"),
                Disaster(nameDisaster = "War", disasterType = "Man-made")

            )
        }
}