package com.codder199912.game1

import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class Registration : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Эта строка подключает ваш XML к коду
        setContentView(R.layout.registration_activity)
        val regBtn = findViewById<Button>(R.id.btnRegister)
        val insertBtn = findViewById<Button>(R.id.btn_insert)
    }
}
