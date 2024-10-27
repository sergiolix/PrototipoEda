package com.example.prototipoeda
import android.content.Intent
import android.media.MediaPlayer
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
class introniv3: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.intro)
        val text1 = findViewById<TextView>(R.id.text_2)
        val text2 = findViewById<TextView>(R.id.text_3)
        val img = findViewById<ImageView>(R.id.imageV)
        val play = findViewById<ImageButton>(R.id.Botonplay)
        val buttonok = findViewById<Button>(R.id.buttonok)
        text1.text = "Palabra"
        text2.text =
            "Una palabra es la unidad mínima gramatical dotada de significado propio. En la cadena hablada, se separa de las demás mediante pausas, y en la escritura mediante espacios en blanco.\n" +
                    "\n" +
                    "Estructura de la palabra\b\n" +
                    "\n" +
                    "Se divide en estructuras mas pequeñas llamadas raíz y monemas, estos se pueden ser de distintas clases"
        img.setImageResource(R.drawable.palabra1)
        var mediaPlayer = MediaPlayer.create(this, R.raw.palabra)
        play.setOnClickListener {
            mediaPlayer.start()
        }
        buttonok.setOnClickListener{
            val intent = Intent(this,niv3::class.java)
            startActivity(intent)
        }
    }
}