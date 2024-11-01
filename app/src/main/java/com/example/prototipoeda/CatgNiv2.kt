package com.example.prototipoeda

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class CatgNiv2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_catg_niv2)
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

        mostrarTutorial(this, "Silaba", "Las silabas son las unidades que se pueden dividir en palabras y contienen uno o más sonidos. Una palabra destaca del resto porque agrupa sonidos vocálicos y consonánticos que se pronuncian unidos. \n" +
                "\n" +
                "Todas las palabras tienen  sílabas,Cada palabra tiene un núcleo, que en español siempre es una vocal (a, e, i, o, u). Además, una palabra consonántica puede tener consonantes, es decir, letras y sonidos que se asocian a una vocal a pronunciar.", R.raw.silaba,"silaba")
        BotonEjercicio1.setOnClickListener{
            val intent = Intent(this,niv2_ss1::class.java)
            startActivity(intent)
        }
        BotonEjercicio2.setOnClickListener{
            val intent = Intent(this,niv2_sups1::class.java)
            startActivity(intent)
        }
        BotonEjercicio3.setOnClickListener{
            val intent = Intent(this,niv2_ri1::class.java)
            startActivity(intent)
        }
        BotonEjercicio4.setOnClickListener{
            val intent = Intent(this,niv2_rf::class.java)
            startActivity(intent)
        }
    }
}