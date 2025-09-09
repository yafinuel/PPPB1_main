package com.example.navigationexample

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import com.example.navigationexample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    private var launcherToThirdActivity = registerForActivityResult(ActivityResultContracts.StartActivityForResult()) {
            result ->
        if (result.resultCode == Activity.RESULT_OK){
            val data = result.data

            val name = data?.getStringExtra("new_name")

            binding.txtMain.text = "Updated Main Activity ${name}"
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding){
            txtMain.text = "Halo"

            btnMain.setOnClickListener {
                val intentToSecondActivity = Intent(this@MainActivity, SecondActivity::class.java)
                intentToSecondActivity.putExtra("nama", "Yafi Nuqman Elianto")
                startActivity(intentToSecondActivity)
            }

            btnMain2.setOnClickListener {
                val intentToThirdActivity = Intent (this@MainActivity, ThirdActivity::class.java)

                launcherToThirdActivity.launch(intentToThirdActivity)
            }
        }
    }
}