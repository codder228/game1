package com.codder199912.game1

import android.content.Intent
import android.os.Bundle
import android.widget.Button // Импорт для кнопки
import android.widget.Toast // Импорт для всплывающих сообщений
import androidx.appcompat.app.AppCompatActivity

class Game : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.main_activity)
        val btn1 = findViewById<Button>(R.id.btn1)
        val btn2 = findViewById<Button>(R.id.btn2)
        var coast = -1

        btn1.setOnClickListener {
            btn1.text = (coast + 1).toString()
            coast = coast + 1
        }

        btn2.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }
    }
}
