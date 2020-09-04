package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.Toast
import com.example.diceroller.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        findViewById will be deprecated use viewBinding

//        val rollButton: Button = findViewById(R.id.roll_button)
//        rollButton.text = "Let's Roll"

        binding.rollButton.text = "Let's Roll"

        binding.root.setVerticalGravity(Gravity.CENTER_VERTICAL)

        binding.rollButton.setOnClickListener {
            Toast.makeText(this, "Button Clicked", Toast.LENGTH_SHORT).show()
            binding.resultText.text = (Random.nextInt(6) + 1).toString()
        }
    }
}