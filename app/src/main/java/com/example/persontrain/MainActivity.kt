package com.example.meuapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val txtInput = findViewById<EditText>(R.id.txtinput)
        val txt = findViewById<TextView>(R.id.txt)
        val button = findViewById<Button>(R.id.button)

        button.setOnClickListener {
            val texto = txtInput.text.toString().trim()

            if (texto.isEmpty()) {
                Toast.makeText(this, "Preencha o campo antes de continuar!", Toast.LENGTH_SHORT).show()
            } else {
                txt.text = "Olá, $texto! Seja bem-vindo(a)!"
                Toast.makeText(this, "Tudo certo! 🎉", Toast.LENGTH_SHORT).show()
                txtInput.setText("")
            }
        }
    }
}