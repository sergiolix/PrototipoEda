package com.example.prototipoeda

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class CatgNiv3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_catg_niv3)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val atras = findViewById<ImageButton>(R.id.BotonAtras1)
        val BotonEjercicio1= findViewById<ImageButton>(R.id.BotonEjercicio1)
        val BotonEjercicio2 = findViewById<ImageButton>(R.id.BotonEjercicio2)
        val BotonEjercicio3 = findViewById<ImageButton>(R.id.BotonEjercicio3)
        val BotonEjercicio4 = findViewById<ImageButton>(R.id.BotonEjercicio4)
        atras.setOnClickListener{
            val intent = Intent(this,Menu::class.java)
            startActivity(intent)
        }

        mostrarTutorial(this, "Palabra", "Una palabra es la unidad mínima gramatical dotada de significado propio. En la cadena hablada, se separa de las demás mediante pausas, y en la escritura mediante espacios en blanco.\n" +
                "\n" +
                "Estructura de la palabra\b\n" +
                "\n" +
                "Se divide en estructuras mas pequeñas llamadas raíz y monemas, estos se pueden ser de distintas clases", R.raw.palabra,"palabra")
        BotonEjercicio1.setOnClickListener{
            val intent = Intent(this,niv3::class.java)
            startActivity(intent)
        }
        BotonEjercicio2.setOnClickListener{
            val intent = Intent(this,niv3::class.java)
            startActivity(intent)
        }
        BotonEjercicio3.setOnClickListener{
            val intent = Intent(this,niv3::class.java)
            startActivity(intent)
        }
        BotonEjercicio4.setOnClickListener{
            val intent = Intent(this,niv3::class.java)
            startActivity(intent)
        }
    }
}