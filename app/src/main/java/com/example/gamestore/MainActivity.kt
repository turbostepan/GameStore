package com.example.gamestore

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myapplication.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val user_login: EditText = findViewById(R.id.user_login)
        val user_password: EditText = findViewById(R.id.user_password)
        val button: Button = findViewById(R.id.button_log)

        button.setOnClickListener{
val login = user_login.text.toString().trim()
            val passwod = user_password.text.toString().trim()

            if(login == "" || passwod == "")
                Toast.makeText(this, "Не все поля заполнены!", Toast.LENGTH_LONG).show()
            else {
                
            }
        }
    }
}