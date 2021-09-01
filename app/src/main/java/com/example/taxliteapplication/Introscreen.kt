package com.example.taxliteapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.taxliteapplication.databinding.ActivityIntroscreenBinding

class Introscreen : AppCompatActivity() {

    private lateinit var binding: ActivityIntroscreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityIntroscreenBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.button.setOnClickListener{
            var intent = Intent( this,SignUpScreen::class.java)

        }
    }
}