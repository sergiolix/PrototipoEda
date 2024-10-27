package com.example.prototipoeda
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.MediaController
import android.widget.TextView
import android.widget.Toast
import android.widget.VideoView
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
class niv2_ss1 : AppCompatActivity() {
    private lateinit var palText: TextView
    private lateinit var userInput: EditText
    private lateinit var Button1: Button
    private lateinit var imagen: ImageView
    private lateinit var Button2: Button
    private lateinit var Text2: TextView
    private lateinit var atras: ImageButton
    private lateinit var Text3: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.introvid)
        val vid = findViewById<VideoView>(R.id.videoView_video)
        val buttonok = findViewById<Button>(R.id.buttonok)
        val mc = MediaController(this)

        val path = Uri.parse("android.resource://com.example.prototipoeda/" + R.raw.ss)
        vid.setMediaController(mc)
        vid.setVideoURI(path)
        vid.start()
        buttonok.setOnClickListener{
            eje1()
        }
    }
    private fun inte(){
        setContentView(R.layout.nivel2_ss1)
        // Inicializar los elementos de la interfaz
        palText = findViewById(R.id.text_1)
        userInput = findViewById(R.id.palabra)
        Button1 = findViewById(R.id.button_1)
        imagen = findViewById(R.id.imageV)
        Button2 = findViewById(R.id.button_2)
        Text2 = findViewById(R.id.text_2)
        atras = findViewById(R.id.BotonAtras1)
        Text3 = findViewById(R.id.textoBar)
        Text2.text = "Escribe la palabra separada en sílabas con comas (,):"
    }
    private fun eje1(){
        // Obtener los elementos de la interfaz
        inte()
        Text3.text = "Ejercicio 1"
        atras.setOnClickListener{
            val intent = Intent(this,CatgNiv2::class.java)
            startActivity(intent)
        }
        Button2.setOnClickListener{
            eje2()
        }
        // Asignar una imagen desde los recursos drawable
        imagen.setImageResource(R.drawable.mano12)
        // Palabra que debe separarse en sílabas
        val pal = "ma-no"
        // Eliminar guiones
        palText.text = pal.replace("-", "")
        // verificar la respuesta
        Button1.setOnClickListener {
            val userResponse = userInput.text.toString().lowercase()
            val correctSyllables = pal.split("-").joinToString(", ")
            verificar(userResponse, correctSyllables)
        }
    }
    private fun eje2() {
        // Obtener los elementos de la interfaz
        inte()
        Text3.text = "Ejercicio 2"
        atras.setOnClickListener{
            eje1()
        }
        Button2.setOnClickListener{
            eje3()
        }
        // Asignar una imagen desde los recursos drawable
        imagen.setImageResource(R.drawable.zapato12)
        // Palabra que debe separarse en sílabas
        val pal = "za-pa-to"
        // Eliminar guiones
        palText.text = pal.replace("-", "")
        // verificar la respuesta
        Button1.setOnClickListener {
            val userResponse = userInput.text.toString().lowercase()
            val correctSyllables = pal.split("-").joinToString(", ")
            verificar(userResponse, correctSyllables)
        }
    }
    private fun eje3(){
        // Obtener los elementos de la interfaz
        inte()
        Text3.text = "Ejercicio 3"
        atras.setOnClickListener{
            eje2()
        }
        Button2.setOnClickListener{
            eje4()
        }
        // Asignar una imagen desde los recursos drawable
        imagen.setImageResource(R.drawable.tomate12)
        // Palabra que debe separarse en sílabas
        val pal = "to-ma-te"
        // Eliminar guiones
        palText.text = pal.replace("-", "")
        // verificar la respuesta
        Button1.setOnClickListener {
            val userResponse = userInput.text.toString().lowercase()
            val correctSyllables = pal.split("-").joinToString(", ")
            verificar(userResponse, correctSyllables)
        }
    }
    private fun eje4(){
        // Obtener los elementos de la interfaz
        inte()
        Text3.text = "Ejercicio 4"
        atras.setOnClickListener{
            eje3()
        }
        Button2.setOnClickListener{
            eje5()
        }
        // Asignar una imagen desde los recursos drawable
        imagen.setImageResource(R.drawable.sol12)
        // Palabra que debe separarse en sílabas
        val pal = "sol"
        // Eliminar guiones
        palText.text = pal.replace("-", "")
        // verificar la respuesta
        Button1.setOnClickListener {
            val userResponse = userInput.text.toString().lowercase()
            val correctSyllables = pal.split("-").joinToString(", ")
            verificar(userResponse, correctSyllables)
        }
    }
    private fun eje5(){
        // Obtener los elementos de la interfaz
        inte()
        Text3.text = "Ejercicio 5"
        atras.setOnClickListener{
            eje4()
        }
        Button2.setOnClickListener{
            eje6()
        }
        // Asignar una imagen desde los recursos drawable
        imagen.setImageResource(R.drawable.cama12)
        // Palabra que debe separarse en sílabas
        val pal = "ca-ma"
        // Eliminar guiones
        palText.text = pal.replace("-", "")
        // verificar la respuesta
        Button1.setOnClickListener {
            val userResponse = userInput.text.toString().lowercase()
            val correctSyllables = pal.split("-").joinToString(", ")
            verificar(userResponse, correctSyllables)
        }
    }
    private fun eje6(){
        // Obtener los elementos de la interfaz
        inte()
        Text3.text = "Ejercicio 6"
        atras.setOnClickListener{
            eje5()
        }
        Button2.setOnClickListener{
            Toast.makeText(this, "No hay más ejercicios disponibles", Toast.LENGTH_SHORT).show()
        }
        // Asignar una imagen desde los recursos drawable
        imagen.setImageResource(R.drawable.caramelo12)
        // Palabra que debe separarse en sílabas
        val pal = "ca-ra-me-lo"
        // Eliminar guiones
        palText.text = pal.replace("-", "")
        Button1.setOnClickListener{
            val userResponse =userInput.text.toString().lowercase()
            val correctSyllables = pal.split("-").joinToString(", ")
            verificar(userResponse, correctSyllables)
        }
    }
    private fun  verificar(userResponse: String, correctSyllables: String){
        if (userResponse == correctSyllables) {
            mostrarDialogoFelicitaciones()
        } else {
            mostrarDialogomal()
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