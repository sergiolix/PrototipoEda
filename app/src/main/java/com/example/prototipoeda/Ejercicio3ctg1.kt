package com.example.prototipoeda

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.MediaController
import android.widget.TextView
import android.widget.Toast
import android.widget.VideoView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Ejercicio3ctg1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_ejercicio3ctg1)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main1)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val botonAtras = findViewById<ImageButton>(R.id.BotonAtras1) //cree una variable
        val botonsiguiente = findViewById<Button>(R.id.BotonSiguiente)//cree otra variable
        val Textobar = findViewById<TextView>(R.id.TextoBar)//cree tres variables
        val TextoEjercicio = findViewById<TextView>(R.id.TextoEjercicio2Ctg1)
        val numero: Int = intent.extras?.getInt("Numero") ?: 1
        val Enviar = findViewById<Button>(R.id.ConfirmarBoton)
        val Erespuesta = findViewById<EditText>(R.id.textorespuesta)
        val ImagenCentral = findViewById<ImageView>(R.id.ImagenEjercicio3)
        val textosonido = findViewById<TextView>(R.id.textosonido)

        when (numero) {
            1 -> {
                Textobar.text = "Ejercicio $numero"
                textosonido.text = "Sonido de A"
                TextoEjercicio.text = "Casa"
                ImagenCentral.setImageResource(R.drawable.casa)
            }

            2 -> {
                Textobar.text = "Ejercicio $numero"
                textosonido.text = "Sonido de B"
                TextoEjercicio.text = "Tambor "
                ImagenCentral.setImageResource(R.drawable.tamborc)
            }

            3 -> {
                Textobar.text = "Ejercicio $numero"
                textosonido.text = "Sonido de O"
                TextoEjercicio.text = "Ojo"
                ImagenCentral.setImageResource(R.drawable.ojoc)
            }

            4 -> {
                Textobar.text = "Ejercicio $numero"
                textosonido.text = "Sonido de T"
                TextoEjercicio.text = "Tomate"
                ImagenCentral.setImageResource(R.drawable.tomate)
            }

            5 -> {
                Textobar.text = "Ejercicio $numero"
                textosonido.text = "Sonido de R"
                TextoEjercicio.text = "Arbol"
                ImagenCentral.setImageResource(R.drawable.arbol)
            }

            6 -> {
                Textobar.text = "Ejercicio $numero"
                textosonido.text = "Sonido de A"
                TextoEjercicio.text = "Camara "
                ImagenCentral.setImageResource(R.drawable.camarac)
            }

            else -> {
                Log.i("Ah?", "Como paso esto")
            }
        }


        Enviar.setOnClickListener {
            val respuesta = Erespuesta.text.toString().toInt()

            val validaciones = mapOf(
                1 to 2,
                2 to 1,
                3 to 2,
                4 to 2,
                5 to 1,
                6 to 3
            )


            val combinacionCorrecta = validaciones[numero]


            if (combinacionCorrecta != null) {

                if (combinacionCorrecta == respuesta) {
                    DialogUtils.mostrarDialogoPersonalizado(this, "correcto",R.drawable.feliz)
                } else {
                    DialogUtils.mostrarDialogoPersonalizado(this, "Incorrecto Sigue Intentando",R.drawable.triste)
                }
            } else {

                DialogUtils.mostrarDialogoPersonalizado(this, "Incorrecto Sigue Intentando",R.drawable.triste)
            }
        }

        botonsiguiente.setOnClickListener{
            if(numero < 6 ){
            val intent = Intent(this, Ejercicio3ctg1::class.java)
            intent.putExtra("Numero", numero + 1)
            startActivity(intent)
            }else{
                Toast.makeText(this, "No hay mas Ejercicios Disponibles", Toast.LENGTH_SHORT).show()
            }
        }
        //
        botonAtras.setOnClickListener{
            val intent = Intent(this,Categoria1::class.java)
            startActivity(intent)
        }
    }
}