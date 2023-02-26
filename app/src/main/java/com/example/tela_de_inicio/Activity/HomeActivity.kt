package com.example.tela_de_inicio.Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.tela_de_inicio.R

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val welcomeTextView = findViewById<TextView>(R.id.welcome_message)
        val welcomeStartMessageTextView = findViewById<TextView>(R.id.welcome_Start_message)
        val username = intent.getStringExtra("username")
        welcomeTextView.text = "Welcome, $username!"
        welcomeStartMessageTextView.text
    }
}