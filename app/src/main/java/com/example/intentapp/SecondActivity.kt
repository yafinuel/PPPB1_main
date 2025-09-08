package com.example.intentapp

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.intentapp.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnBackSecond.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        binding.btnNextSecond.setOnClickListener {
            val intent = Intent(this, ThirdActivity::class.java)
            val namaPengguna = binding.inpSecond.text.toString()

            if (namaPengguna != "") {
                intent.putExtra("Text", namaPengguna)
            }
            startActivity(intent)
        }
    }
}