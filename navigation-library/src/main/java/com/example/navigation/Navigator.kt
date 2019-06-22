package com.example.navigation

import android.content.Context

object Navigator {

    fun goTo(context: Context?, navData: NavData) {
        context?.let {
            val intent = navData.createIntent(it)
            it.startActivity(intent)
        }
    }
}