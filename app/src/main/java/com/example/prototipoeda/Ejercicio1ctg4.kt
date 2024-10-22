package com.example.prototipoeda

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
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
           val numero: Int = intent.extras?.getInt("Numero") ?:0
           val Enviar = findViewById<Button>(R.id.BotonEnviar)
           val Erespuesta= findViewById<EditText>(R.id.TextoRespuesta)

        botonAtras.setOnClickListener{
            val intent = Intent(this,categoria4::class.java)
            startActivity(intent)
        }

         when(numero){
             1 ->{Textobar.text = "Ejercicio $numero"
                  TextoEjercicio.text = "Ordena la Oracion: \n Me - la - para - voy - casa" }
             2 ->{Textobar.text = "Ejercicio $numero"
                  TextoEjercicio.text = "Ordena la Oracion: \n Amarillo - es - el - sol "}
             3 ->{Textobar.text = "Ejercicio $numero"
                 TextoEjercicio.text = "Ordena la Oracion: \n Con - salir - perro - a - voy - mi"}
             4 ->{Textobar.text = "Ejercicio $numero"
                 TextoEjercicio.text = "Ordena la Oracion: \n Ir- a – playa – la – quiero "}
             5 ->{Textobar.text = "Ejercicio $numero"
                 TextoEjercicio.text = "Ordena la Oracion: \n Amigos- a – con – jugar- voy "}
             6 ->{Textobar.text = "Ejercicio $numero"
                 TextoEjercicio.text = "Ordena la Oracion: \n Soleado – esta – día – el "}
             else -> {Log.i("Ah?","Como paso esto")}
         }



        Enviar.setOnClickListener{
            val respuesta = Erespuesta.text.toString()

            when(numero){
                1->{
                    if(respuesta.lowercase() == "me voy para la casa".lowercase()){
                        Toast.makeText(this, "Correcto", Toast.LENGTH_SHORT).show()

                    }else{
                        Toast.makeText(this, "Incorrecto, Sigue intentando", Toast.LENGTH_SHORT).show()
                    }
                }
                2->{if(respuesta.lowercase() == "el sol es amarillo".lowercase()){
                    Toast.makeText(this, "correcto", Toast.LENGTH_SHORT).show()

                }else{
                    Toast.makeText(this, "Incorrecto, sigue intentando", Toast.LENGTH_SHORT).show()

                }
                }
                3->{if(respuesta.lowercase() == "voy a salir con mi perro".lowercase()){
                       Toast.makeText(this, "correcto", Toast.LENGTH_SHORT).show()
                }else{
                       Toast.makeText(this, "Incorrecto, sigue intentando", Toast.LENGTH_SHORT).show()
                }
                }
                4->{if(respuesta.lowercase() == "quiero ir a la playa".lowercase()){
                        Toast.makeText(this, "correcto", Toast.LENGTH_SHORT).show()
                }else{
                        Toast.makeText(this, "Incorrecto, sigue intentando", Toast.LENGTH_SHORT).show()
                }
                }
                5->{if(respuesta.lowercase() == "voy a jugar con amigos".lowercase()){
                         Toast.makeText(this, "correcto", Toast.LENGTH_SHORT).show()
                }else{
                        Toast.makeText(this, "Incorrecto, sigue intentando", Toast.LENGTH_SHORT).show()
                }
                }
                6->{if(respuesta.lowercase() == "el dia esta soleado".lowercase()){
                       Toast.makeText(this, "correcto", Toast.LENGTH_SHORT).show()
                }else{
                       Toast.makeText(this, "Incorrecto, sigue intentando", Toast.LENGTH_SHORT).show()
                }
                }
                else->{}
            }

        }
        botonsiguiente.setOnClickListener{
            val intent = Intent(this, Ejercicio1ctg4::class.java)
            intent.putExtra("Numero", numero + 1)
            startActivity(intent)
        }


    }

}