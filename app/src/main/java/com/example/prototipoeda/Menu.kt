package com.example.prototipoeda

import android.content.Context
import android.content.Intent
import android.media.MediaPlayer
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Menu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_menu)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main1)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        mostrarTutorial(
            this,
            "Bienvenidos a Eda",
            "Hola Bienvenidos A Eda Nuestra Aplicacion De Conciencia Fonologica. En esta pantalla encontraras 4 categorias de ejercicios para realizar cada una de estas categorias tiene ejercicios distintos y variados prueba intentar con la primera que se muestra Arriba del todo, Espero Disfrutes la Aplicacion.",
            R.raw.audiomenu,
            "Pantalla1"
        )
        val BotonCtg1 = findViewById<Button>(R.id.BotonCtg1)
        val BotonCtg4 = findViewById<Button>(R.id.botonCtg4)
        val BotonCtg2 = findViewById<Button>(R.id.BotonCtg2)
        val BotonCtg3 = findViewById<Button>(R.id.botonCtg3)
        BotonCtg1.setOnClickListener {
            val intent = Intent(this, Categoria1::class.java)
            startActivity(intent)

        }
        BotonCtg2.setOnClickListener {
            val intent = Intent(this, CatgNiv2::class.java)
            startActivity(intent)

        }
        BotonCtg3.setOnClickListener{
            val intent = Intent(this, CatgNiv3::class.java)
            startActivity(intent)
        }

        BotonCtg4.setOnClickListener {
            val intent = Intent(this, categoria4::class.java)

            startActivity(intent)


        }
    }
}