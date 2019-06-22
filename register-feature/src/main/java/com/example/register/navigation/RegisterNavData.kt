package com.example.register.navigation

import android.content.Context
import android.content.Intent
import com.example.navigation.NavData
import com.example.register.RegisterActivity

class RegisterNavData : NavData {
    override fun createIntent(context: Context): Intent {
        return RegisterActivity.createIntent(context)
    }
}