package com.example.tela_de_inicio.Activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.example.tela_de_inicio.R

class RegisterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val registerButton = findViewById<Button>(R.id.registerButton)
        registerButton.setOnClickListener {
            // obter os valores do email e senha
            val email = findViewById<EditText>(R.id.emailEditText).text.toString()
            val password = findViewById<EditText>(R.id.passwordEditText).text.toString()

            // adicionar a lógica para criar uma nova conta de usuário aqui
            // ...

            // abrir a tela de início com o nome de usuário registrado
            val intent = Intent(this@RegisterActivity, HomeActivity::class.java)
            intent.putExtra("username", email)
            startActivity(intent)
            finish()
        }
    }
}