package com.example.modularapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.navigation.Navigator
import com.example.register.navigation.RegisterNavData

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Navigator.goTo(this, RegisterNavData())
    }
}
