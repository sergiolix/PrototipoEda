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

        mostrarTutorial(this,"Nivel Sonidos","Hola En Esta Categoría Encontraras 4 Niveles cada uno es diferente del otro,\n" +
                "En el primero tendrás que seleccionar las imágenes que Empiezan por el mismo sonido de la letra, El Segundo es similar al primero pero esta vez con el sonido que sea igual pero esta vez al final, El Numero tres es sobre cuantas veces esta el sonido de una letra en una palabra, y el numero 4 trata sobre buscar la letra diferente entre muchas letras. También cuando Selecciones la categoría Dentro de esta tendrá un Tutorial en el Primer Ejercicio que realices. ",R.raw.audiocategoria1,"Pantalla2")
        BackButton.setOnClickListener{
             val intent = Intent(this,Menu::class.java)
             startActivity(intent)
        }
        configurarBoton(BotonEjercicio1 , 1 )
        configurarBoton(BotonEjercicio2 , 2 )
        BotonEjercicio3.setOnClickListener {
            val intent = Intent(this , Ejercicio3ctg1::class.java)
            startActivity(intent)

        }
        BotonEjercicio4.setOnClickListener {
            val intent = Intent(this, ejercicio4ctg1::class.java )
            startActivity(intent)
        }

    }
    fun configurarBoton(boton: ImageButton, numero1: Int) {
        boton.setOnClickListener {
            val intent1 = Intent(this, Ejercicio1ctg1::class.java)
            intent1.putExtra("menu1", numero1)
            startActivity(intent1)
        }
    }

}