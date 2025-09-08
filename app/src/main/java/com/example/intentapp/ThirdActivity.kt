package com.example.intentapp

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.intentapp.databinding.ActivityThirdBinding

class ThirdActivity : AppCompatActivity() {

    lateinit var binding: ActivityThirdBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivityThirdBinding.inflate(layoutInflater)
        setContentView(binding.root)

        if (intent.hasExtra("Text")) {
            binding.txtNamaThird.text = intent.getStringExtra("Text")
        } else {
            binding.txtNamaThird.text = "Sosok misterius"
        }

        binding.btnNextThird.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}