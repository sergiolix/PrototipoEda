package com.example.prototipoeda

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class categoria4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_categoria4)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main1)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
           val BotonEjercicio1= findViewById<ImageButton>(R.id.BotonEjercicio1)
           val BotonEjercicio2= findViewById<ImageButton>(R.id.BotonEjercicio2)
           val BotonEjercicio3= findViewById<ImageButton>(R.id.BotonEjercicio3)
           val BotonEjercicio4= findViewById<ImageButton>(R.id.BotonEjercicio4)
           val atras = findViewById<ImageButton>(R.id.BotonAtras1)

        BotonEjercicio1.setOnClickListener {
            val intent = Intent(this,Video::class.java)
            intent.putExtra("Video", 5)
            startActivity(intent)
        }
        configurarBoton(BotonEjercicio2, 2)
        configurarBoton(BotonEjercicio3, 3)
        configurarBoton(BotonEjercicio4, 4)
        atras.setOnClickListener{
            val intent = Intent (this,Menu::class.java)
            startActivity(intent)
        }
        mostrarTutorial(this, "Oraciones","Una oración es una unidad gramatical que se compone de un sujeto y un predicado. El individuo siempre tiene un sustantivo como núcleo y nunca puede comenzar por una preposición. El predicado se fundamenta en un verbo, que puede ir conjugado en un tiempo sencillo, compuesto o ser una perífrasis verbal.\n" +
                "Tipos de oraciones \n" +
                "•\tOraciones gramaticales simples\n" +
                "•\tOraciones gramaticales Compuestas \n" +
                "•\tOraciones gramaticales activas\n" +
                "•\tOraciones gramaticales pasivas", R.raw.audiocategoria4,"Pantalla4")
    }



    fun configurarBoton(boton: ImageButton, numero: Int) {
        boton.setOnClickListener {
            val intent = Intent(this, Ejercicio1ctg4::class.java)
            intent.putExtra("Numero", numero)
            startActivity(intent)
        }
    }
}