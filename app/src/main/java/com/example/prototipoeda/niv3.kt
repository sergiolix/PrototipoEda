package com.example.prototipoeda
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import android.widget.Toast
class niv3 : AppCompatActivity() {
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
        eje1()
    }
    private fun inte(){
        setContentView(R.layout.nivel3)
        // Inicializar los elementos de la interfaz
        palText = findViewById(R.id.text_1)
        userInput = findViewById(R.id.palabra)
        Button1 = findViewById(R.id.button_1)
        imagen = findViewById(R.id.imageV)
        Button2 = findViewById(R.id.button_2)
        Text2 = findViewById(R.id.text_2)
        atras = findViewById(R.id.BotonAtras1)
        Text3 = findViewById(R.id.textoBar)
    }
    private fun eje1(){
        // Obtener los elementos de la interfaz
        inte()
        Text3.text = "Ejercicio 1"
        atras.setOnClickListener{
            val intent = Intent(this,Menu::class.java)
            startActivity(intent)
        }
        Button2.setOnClickListener{
            eje2()
        }
        Text2.text = "Que le falta piz para convertirse"
        // Asignar una imagen desde los recursos drawable
        imagen.setImageResource(R.drawable.lapiz12)
        // Palabra que debe quitar
        val pal = "la"
        palText.text = ""
        // verificar la respuesta
        Button1.setOnClickListener {
            val userResponse = userInput.text.toString().lowercase()
            val correctSyllables = pal.split("-").joinToString(", ")
            verificar(userResponse, correctSyllables)
        }
    }
    private fun eje2(){
        // Obtener los elementos de la interfaz
        inte()
        Text3.text = "Ejercicio 2"
        atras.setOnClickListener{
            eje1()
        }
        Button2.setOnClickListener{
            eje3()
        }
        Text2.text = "Que le falta na para convertirse"
        // Asignar una imagen desde los recursos drawable
        imagen.setImageResource(R.drawable.rana12)
        // Palabra que debe quitar
        val pal = "ra"
        palText.text = ""
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
        Text2.text = "Que le falta male para convertirse"
        // Asignar una imagen desde los recursos drawable
        imagen.setImageResource(R.drawable.maleta12)
        // Palabra que debe quitar
        val pal = "ta"
        palText.text = ""
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
        Text2.text = "Que le falta bro para convertirse"
        // Asignar una imagen desde los recursos drawable
        imagen.setImageResource(R.drawable.libro12)
        // Palabra que debe quitar
        val pal = "li"
        palText.text = ""
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
        Button2.setOnClickListener {
            eje6()
        }
        Text2.text = "Que le falta ba para convertirse"
        // Asignar una imagen desde los recursos drawable
        imagen.setImageResource(R.drawable.balon12)
        // Palabra que debe quitar
        val pal = "lon"
        palText.text = ""
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
        Text2.text = "Que le falta meta para convertirse"
        // Asignar una imagen desde los recursos drawable
        imagen.setImageResource(R.drawable.ciempies12)

        // Palabra que debe quitar
        val pal = "co"
        palText.text = ""

        // verificar la respuesta
        Button1.setOnClickListener {
            val userResponse = userInput.text.toString().lowercase()
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