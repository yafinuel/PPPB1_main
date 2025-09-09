package com.example.navigationexample

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.navigationexample.databinding.ActivityThirdBinding

class ThirdActivity : AppCompatActivity() {

    lateinit var binding: ActivityThirdBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivityThirdBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding){
            btnThird.setOnClickListener {
                var resultIntent = Intent()

//                Kirim data
                resultIntent.putExtra("new_name", "Sri Mulyani")

//                set result
                setResult(RESULT_OK, resultIntent)

//                set finish
                finish()
            }
        }
    }
}