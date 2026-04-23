package com.codder199912.game1

import android.content.Intent
import android.os.Bundle
import android.widget.Button // Импорт для кнопки
import android.widget.ImageButton
import android.widget.PopupMenu
import android.widget.Toast // Импорт для всплывающих сообщений
import androidx.appcompat.app.AppCompatActivity

class Game : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)

        val btnToday = findViewById<Button>(R.id.btnToday)
        val btnStatistics = findViewById<Button>(R.id.btnStatistic)
        val btnProfile = findViewById<ImageButton>(R.id.btnProfile)
        val btnMenu = findViewById<ImageButton>(R.id.btnMenu)
        var regBool: Boolean = false

//        if (regBool == false) {
        btnProfile.setOnClickListener {
            val intent = Intent(this, Registration::class.java)
            startActivity(intent)
//            }
        }
    }
}
