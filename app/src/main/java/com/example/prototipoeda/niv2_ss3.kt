package com.example.prototipoeda
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
class niv2_ss3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.nivel2_ss1)

        // Obtener los elementos de la interfaz
        val palText = findViewById<TextView>(R.id.text_1)
        val userInput = findViewById<EditText>(R.id.palabra)
        val Button1 = findViewById<Button>(R.id.button_1)
        val imagen = findViewById<ImageView>(R.id.imageV)
        val Button2 = findViewById<Button>(R.id.button_2)
        Button2.setOnClickListener{
            val intent = Intent(this,niv2_ss4::class.java)
            startActivity(intent)
        }
        // Asignar una imagen desde los recursos drawable
        imagen.setImageResource(R.drawable.tomate)

        // Palabra que debe separarse en sílabas
        val pal = "to-ma-te"
        // Eliminar guiones
        palText.text = pal.replace("-", "")

        // verificar la respuesta
        Button1.setOnClickListener {
            val userResponse = userInput.text.toString()
            val correctSyllables = pal.split("-").joinToString(", ")

            if (userResponse == correctSyllables) {
               mostrarDialogoFelicitaciones()
            } else {
                mostrarDialogomal()
            }
        }
    }
    private fun mostrarDialogoFelicitaciones() {
        // Inflar el layout personalizado
        val inflater: LayoutInflater = layoutInflater
        val dialogView = inflater.inflate(R.layout.fel, null)

        // Crear el AlertDialog
        val builder = AlertDialog.Builder(this)
        builder.setView(dialogView)
        builder.setPositiveButton("OK") { dialog, _ ->
            dialog.dismiss() // Cerrar el diálogo cuando se presione OK
        }

        // Mostrar el diálogo
        val dialog: AlertDialog = builder.create()
        dialog.show()
    }
    private fun mostrarDialogomal() {
        // Inflar el layout personalizado
        val inflater: LayoutInflater = layoutInflater
        val dialogView = inflater.inflate(R.layout.mal, null)

        // Crear el AlertDialog
        val builder = AlertDialog.Builder(this)
        builder.setView(dialogView)
        builder.setPositiveButton("OK") { dialog, _ ->
            dialog.dismiss() // Cerrar el diálogo cuando se presione OK
        }

        // Mostrar el diálogo
        val dialog: AlertDialog = builder.create()
        dialog.show()
    }
}