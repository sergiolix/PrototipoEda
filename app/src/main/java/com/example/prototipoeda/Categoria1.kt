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
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main1)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val BackButton = findViewById<ImageButton>(R.id.BotonAtras1)
        val BotonEjercicio1= findViewById<ImageButton>(R.id.BotonEjercicio1)
        val BotonEjercicio2 = findViewById<ImageButton>(R.id.BotonEjercicio2)
        val BotonEjercicio3 = findViewById<ImageButton>(R.id.BotonEjercicio3)
        val BotonEjercicio4 = findViewById<ImageButton>(R.id.BotonEjercicio4)

        mostrarTutorial(this,"Fonemas"," Un fonema es una unidad mínima de articulación cuyo sonido puede ser vocálico o consonántico, y, por consiguiente, la unión de varios fonemas forma una palabra. Es una unidad compleja del lenguaje pero que para simplificar su explicación diremos que es una unidad mínima de articulación. ",R.raw.audiocategoria1,"Pantalla2")
        BackButton.setOnClickListener{
             val intent = Intent(this,Menu::class.java)
             startActivity(intent)
        }
        configurarBoton(BotonEjercicio1 , 1 )
        configurarBoton(BotonEjercicio2 , 2 )
        configurarBoton(BotonEjercicio3,3)
        configurarBoton(BotonEjercicio4, 4)

    }
    fun configurarBoton(boton: ImageButton, numero1: Int) {
        boton.setOnClickListener {
            val intent1 = Intent(this, Video::class.java)
            intent1.putExtra("Video", numero1)
            startActivity(intent1)
        }
    }

}