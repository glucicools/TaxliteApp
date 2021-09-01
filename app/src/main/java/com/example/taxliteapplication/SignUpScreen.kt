package com.example.taxliteapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.taxliteapplication.databinding.ActivitySignUpScreenBinding

class SignUpScreen : AppCompatActivity() {

    private lateinit var binding: ActivitySignUpScreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        binding = ActivitySignUpScreenBinding.inflate(layoutInflater)

        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.button3.setOnClickListener{
            var intent = Intent (this,LoginActivity::class.java)
        }
    }
}