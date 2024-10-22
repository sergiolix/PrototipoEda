package com.example.prototipoeda

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Ejercicio1ctg1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_ejercicio1ctg1)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main1)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets


        }
        val estados = BooleanArray(4) { false }
        val Imagen1 = findViewById<ImageButton>(R.id.Imagen1)
        val Imagen2 = findViewById<ImageButton>(R.id.Imagen2)
        val Imagen3 = findViewById<ImageButton>(R.id.Imagen3)
        val Imagen4 = findViewById<ImageButton>(R.id.Imagen4)
        val botonatras = findViewById<ImageButton>(R.id.BotonAtras1)
        val botonsiguiente = findViewById<Button>(R.id.botonSiguiente)
        val LetraTitulo = findViewById<TextView>(R.id.TextoLetra)
        val Textobar = findViewById<TextView>(R.id.textoBar)
        val Confirmar = findViewById<Button>(R.id.BotonEnviar)
        val NumEjercicio = intent.getIntExtra("Numero", 1)
        val MenuNum = intent.getIntExtra("menu1", 1)
        val botones = arrayOf(Imagen1, Imagen2, Imagen3, Imagen4)
        botonatras.setOnClickListener {
            val intent = Intent(this, Categoria1::class.java)
            startActivity(intent)
        }
        val datosMenu1 = mapOf(
            1 to listOf("S", R.drawable.cama, R.drawable.pato, R.drawable.silla, R.drawable.silbato),
            2 to listOf("F", R.drawable.mesa, R.drawable.foca, R.drawable.manzana, R.drawable.fuego),
            3 to listOf("T", R.drawable.balon, R.drawable.tetero, R.drawable.tijeras, R.drawable.banano),
            4 to listOf("M", R.drawable.casa, R.drawable.silla, R.drawable.maleta, R.drawable.mariposac),
            5 to listOf("L", R.drawable.libro, R.drawable.lapiz1, R.drawable.casa, R.drawable.balon),
            6 to listOf("Y", R.drawable.maleta, R.drawable.yoyoc, R.drawable.lapiz1, R.drawable.yogurc)
        )

        val datosMenu2 = mapOf(
            1 to listOf("S", R.drawable.tijeras, R.drawable.lapiz1, R.drawable.cama, R.drawable.maleta),
            2 to listOf("N", R.drawable.camion, R.drawable.jabonc, R.drawable.arbol, R.drawable.mesa),
            3 to listOf("L", R.drawable.solc, R.drawable.arbol, R.drawable.camion, R.drawable.yogurc),
            4 to listOf("O", R.drawable.mesa, R.drawable.libro, R.drawable.maleta, R.drawable.ojoc),
            5 to listOf("R", R.drawable.tamborc, R.drawable.jabonc, R.drawable.manzana, R.drawable.celularc),
            6 to listOf("A", R.drawable.ojoc, R.drawable.cama, R.drawable.silla, R.drawable.camion)
        )


        val datosEjercicios = if (MenuNum == 1) datosMenu1 else datosMenu2


        val datos = datosEjercicios[NumEjercicio]

        if (datos != null ) {
            Textobar.text = "Ejercicio $NumEjercicio"
            LetraTitulo.text = datos[0] as String
            Imagen1.setImageResource(datos[1] as Int)
            Imagen2.setImageResource(datos[2] as Int)
            Imagen3.setImageResource(datos[3] as Int)
            Imagen4.setImageResource(datos[4] as Int)
        } else {
            Log.i("Ah?", "Como paso esto")
        }




        for (i in botones.indices) {
            botones[i].setOnClickListener {

                estados[i] = !estados[i]


                if (estados[i]) {
                    Toast.makeText(this, "Seleccionado", Toast.LENGTH_SHORT).show()
                } else {
                    Toast.makeText(this, "No Seleccionado", Toast.LENGTH_SHORT).show()
                }
            }
        }

        Confirmar.setOnClickListener {
            val validaciones1 = mapOf(
                1 to listOf(2, 3),
                2 to listOf(1, 3),
                3 to listOf(1, 2),
                4 to listOf(2, 3),
                5 to listOf(0, 1),
                6 to listOf(1, 3)
            )
            val validaciones2 = mapOf(
                1 to listOf(0, 1),
                2 to listOf(0, 1),
                3 to listOf(0, 1),
                4 to listOf(1, 3),
                5 to listOf(0, 3),
                6 to listOf(1, 2)
            )
            val validaciones = if (MenuNum == 1) validaciones1 else validaciones2

            val combinacionCorrecta = validaciones[NumEjercicio]


            if (combinacionCorrecta != null) {
                val esCorrecto = combinacionCorrecta.all { estados[it] }
                if (esCorrecto) {
                    Toast.makeText(this, "Correcto", Toast.LENGTH_SHORT).show()
                } else {
                    Toast.makeText(this, "Incorrecto, Sigue intentando", Toast.LENGTH_SHORT).show()
                }
            } else {

                Toast.makeText(this, "Incorrecto, Sigue intentando", Toast.LENGTH_SHORT).show()
            }
        }

        botonsiguiente.setOnClickListener {
            val intent = Intent(this, Ejercicio1ctg1::class.java)
            intent.putExtra("Numero", NumEjercicio + 1)
            startActivity(intent)
        }
    }
}