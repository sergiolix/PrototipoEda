package com.example.prototipoeda

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Menu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_menu)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main1)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val BotonCtg1 = findViewById<Button>(R.id.BotonCtg1)
        val BotonCtg4 = findViewById<Button>(R.id.botonCtg4)
        BotonCtg1.setOnClickListener{
            val intent = Intent(this,Categoria1::class.java)
            startActivity(intent)

        }
        BotonCtg4.setOnClickListener{
            val intent = Intent(this,categoria4::class.java)
            startActivity(intent)

        }
    }
}