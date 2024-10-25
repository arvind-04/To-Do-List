package com.example.recyclerviewone

import android.app.ActivityManager.TaskDescription

data class UserNewModel(var id: Int = getAutoId(), var task: String = "", var description: String = "") {
    companion object {
        fun getAutoId(): Int {
            val random = java.util.Random()
            return random.nextInt(100)
        }
    }
}