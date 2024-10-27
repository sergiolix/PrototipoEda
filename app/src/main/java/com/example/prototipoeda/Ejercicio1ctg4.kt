package com.example.prototipoeda

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Ejercicio1ctg4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_ejercicio1ctg4)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main1)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
           val botonAtras = findViewById<ImageButton>(R.id.BotonAtras1)
           val botonsiguiente = findViewById<Button>(R.id.BotonSiguiente)
           val Textobar = findViewById<TextView>(R.id.TextoBar)
           val TextoEjercicio= findViewById<TextView>(R.id.TextoEjerciciosCtg4)
           val numero: Int = intent.extras?.getInt("Numero") ?:1
           val Enviar = findViewById<Button>(R.id.BotonEnviar)
           val Erespuesta= findViewById<EditText>(R.id.TextoRespuesta)
           val imagen = findViewById<ImageView>(R.id.imageView2)

        botonAtras.setOnClickListener{
            val intent = Intent(this,categoria4::class.java)
            startActivity(intent)
        }

        // Crea un mapa que asocie el número del ejercicio con la oración y la respuesta correcta
        val ejercicios = mapOf(
            1 to Triple("Me - la - para - voy - casa", "me voy para la casa",R.drawable.casa),
            2 to Triple("Amarillo - es - el - sol", "el sol es amarillo", R.drawable.sol),
            3 to Triple("Con - salir - perro - a - voy - mi", "voy a salir con mi perro",R.drawable.lapiz1),
            4 to Triple("Ir- a – playa – la – quiero", "quiero ir a la playa" ,R.drawable.arbol),
            5 to Triple("Amigos- a – con – jugar- voy", "voy a jugar con amigos",R.drawable.balon),
            6 to Triple("Soleado – esta – día – el", "el día está soleado",R.drawable.sol)
        )

// Actualiza la vista según el número del ejercicio
        val (oracion, respuestaCorrecta ,imagenesResId) = ejercicios[numero] ?: Triple("", "", 0)
        Textobar.text = "Ejercicio $numero"
        TextoEjercicio.text = "Ordena la Oracion: \n $oracion"
        imagen.setImageResource(imagenesResId)

        Enviar.setOnClickListener {
            val respuesta = Erespuesta.text.toString().lowercase()

            if (respuesta == respuestaCorrecta.lowercase()) {
                DialogUtils.mostrarDialogoPersonalizado(this, "correcto",R.drawable.feliz)
            } else {
                DialogUtils.mostrarDialogoPersonalizado(this, "Incorrecto Sigue Intentando",R.drawable.triste)
            }



    }
        botonsiguiente.setOnClickListener{
            if(numero < 6){
            val intent = Intent(this, Ejercicio1ctg4::class.java)
            intent.putExtra("Numero", numero + 1)
            startActivity(intent)
            }else{
                Toast.makeText(this, "no hay mas ejercicios", Toast.LENGTH_SHORT).show()
            }
        }


    }

}