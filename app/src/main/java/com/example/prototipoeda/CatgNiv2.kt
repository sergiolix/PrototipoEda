package com.example.prototipoeda
import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class CatgNiv2: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.catgniv2)
        val atras = findViewById<ImageButton>(R.id.BotonAtras1)
        val BotonEjercicio1= findViewById<ImageButton>(R.id.BotonEjercicio1)
        val BotonEjercicio2 = findViewById<ImageButton>(R.id.BotonEjercicio2)
        val BotonEjercicio3 = findViewById<ImageButton>(R.id.BotonEjercicio3)
        val BotonEjercicio4 = findViewById<ImageButton>(R.id.BotonEjercicio4)
        atras.setOnClickListener{
            val intent = Intent(this,Menu::class.java)
            startActivity(intent)
        }
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