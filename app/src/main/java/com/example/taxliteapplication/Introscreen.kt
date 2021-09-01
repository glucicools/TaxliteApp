package com.example.taxliteapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.WindowManager
import com.example.taxliteapplication.databinding.ActivityIntroscreenBinding

class Introscreen : AppCompatActivity() {

    private lateinit var binding: ActivityIntroscreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_introscreen)

        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN

        )
        Handler().postDelayed({


            var intent = Intent( this,SignUpScreen::class.java)

        }
    }
}