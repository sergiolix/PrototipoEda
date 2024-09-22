package com.example.prototipoeda

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Categoria1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_categoria1)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val BackButton = findViewById<ImageButton>(R.id.BotonAtras2)
        val BotonEjercicio1= findViewById<ImageButton>(R.id.BotonEjercicio1)

        BackButton.setOnClickListener{
             val intent = Intent(this,Menu::class.java)
             startActivity(intent)
        }

        BotonEjercicio1.setOnClickListener{
            val intent = Intent (this,Ejercicio1::class.java)
            startActivity(intent)
        }
    }
}