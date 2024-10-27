package com.example.prototipoeda

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import android.media.MediaPlayer
import android.widget.Button

class introniv2: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.intro)
        val text1 = findViewById<TextView>(R.id.text_2)
        val text2 = findViewById<TextView>(R.id.text_3)
        val img = findViewById<ImageView>(R.id.imageV)
        val play = findViewById<ImageButton>(R.id.Botonplay)
        val buttonok = findViewById<Button>(R.id.buttonok)
        text1.text = "Silaba"
        text2.text = "Las silabas son las unidades que se pueden dividir en palabras y contienen uno o más sonidos. Una palabra destaca del resto porque agrupa sonidos vocálicos y consonánticos que se pronuncian unidos. \n" +
                "\n" +
                "Todas las palabras son sílabas, desde las largas hasta las únicas. Cada palabra tiene un núcleo, que en español siempre es una vocal (a, e, i, o, u). Además, una palabra consonántica puede tener consonantes, es decir, letras y sonidos que se asocian a una vocal a pronunciar."
        img.setImageResource(R.drawable.silaba)
        var mediaPlayer = MediaPlayer.create(this, R.raw.silaba)
        play.setOnClickListener{
            mediaPlayer.start()
        }
        buttonok.setOnClickListener{
            val intent = Intent(this,CatgNiv2::class.java)
            startActivity(intent)
        }
    }
}