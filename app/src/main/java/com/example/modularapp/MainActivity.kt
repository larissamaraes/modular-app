package com.example.modularapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.register.RegisterActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        RegisterActivity.startActivity(this)
    }
}
