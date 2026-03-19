package com.codder199912.game1

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import android.widget.Button
import android.widget.ProgressBar
import android.widget.TextView
import android.widget.Toast // Импорт для всплывающих сообщений
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val progressBar = findViewById<ProgressBar>(R.id.ProgressBar1)
        val statusText = findViewById<TextView>(R.id.statusText)
        val btnBack = findViewById<Button>(R.id.btnBack)
        btnBack.setOnClickListener {
            // 1. Скрываем кнопку, чтобы на неё не нажали дважды
            btnBack.visibility = View.GONE

            // 2. Показываем полоску загрузки
            progressBar.visibility = View.VISIBLE
            statusText.text = "Загрузка..."

            // 3. Запускаем таймер на 3000 миллисекунд (3 секунды)
            Handler(Looper.getMainLooper()).postDelayed({
                // 4. Код внутри этих скобок сработает через 3 секунды
                val intent = Intent(this, Game::class.java)

                // Flags очищают историю переходов, чтобы нельзя было нажать "назад" и вернуться к загрузке
                intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK

                startActivity(intent)
                finish() // Закрываем это окно
            }, 3000)
        }
    }
}
