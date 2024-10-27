package com.example.prototipoeda
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Button
import android.widget.CheckBox
import android.widget.ImageButton
import android.widget.MediaController
import androidx.appcompat.app.AlertDialog
import android.widget.TextView
import android.widget.Toast
import android.widget.VideoView

class niv2_rf : AppCompatActivity(){
    private lateinit var opcion1: CheckBox
    private lateinit var opcion2: CheckBox
    private lateinit var opcion3: CheckBox
    private lateinit var opcion4: CheckBox
    private lateinit var texto1: TextView
    private lateinit var Button1: Button
    private lateinit var Button2: Button
    private lateinit var atras: ImageButton
    private lateinit var Text3: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.introvid)
        val vid = findViewById<VideoView>(R.id.videoView_video)
        val buttonok = findViewById<Button>(R.id.buttonok)
        val mc = MediaController(this)

        val path = Uri.parse("android.resource://com.example.prototipoeda/" + R.raw.rf)
        vid.setMediaController(mc)
        vid.setVideoURI(path)
        vid.start()
        buttonok.setOnClickListener{
            eje1()
        }
    }
    private fun inte(){
        setContentView(R.layout.nivel2_ri)
        // Inicializar los elementos de la interfaz
        opcion1 = findViewById<CheckBox>(R.id.opc1)
        opcion2 = findViewById<CheckBox>(R.id.opc2)
        opcion3 = findViewById<CheckBox>(R.id.opc3)
        opcion4 = findViewById<CheckBox>(R.id.opc4)
        texto1 = findViewById<TextView>(R.id.text_1)
        Button1 = findViewById<Button>(R.id.button_1)
        Button2 = findViewById<Button>(R.id.button_2)
        atras = findViewById(R.id.BotonAtras1)
        Text3 = findViewById(R.id.textoBar)
        texto1.text = "Seleccione las imagenes que corresponden a las palabras que termine con la misma silaba:"
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
        // Agregar imágenes a las opciones
        val opciones = arrayOf(opcion1, opcion2, opcion3, opcion4)
        val recursos = arrayOf(R.drawable.lapiz12, R.drawable.banano12, R.drawable.libro12, R.drawable.rana12)

        // Configurar iconos
        for (i in opciones.indices) {
            TamImg(opciones[i], recursos[i], 230)
        }
        Button1.setOnClickListener {
            // Crear una lista para guardar las opciones seleccionadas
            val selectedOptions = mutableListOf<String>()
            if (opcion1.isChecked) selectedOptions.add(opcion1.text.toString())
            if (opcion2.isChecked) selectedOptions.add(opcion2.text.toString())
            if (opcion3.isChecked) selectedOptions.add(opcion3.text.toString())
            if (opcion4.isChecked) selectedOptions.add(opcion4.text.toString())
            val opcionesCorrectas = listOf("opc2", "opc4")
            verificarSeleccion(selectedOptions, opcionesCorrectas)
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
        // Agregar imágenes a las opciones
        val opciones = arrayOf(opcion1, opcion2, opcion3, opcion4)
        val recursos = arrayOf(R.drawable.casa12, R.drawable.camion12, R.drawable.mesa12, R.drawable.lluvia12)

        // Configurar iconos
        for (i in opciones.indices) {
            TamImg(opciones[i], recursos[i], 230)
        }
        Button1.setOnClickListener {
            // Crear una lista para guardar las opciones seleccionadas
            val selectedOptions = mutableListOf<String>()
            if (opcion1.isChecked) selectedOptions.add(opcion1.text.toString())
            if (opcion2.isChecked) selectedOptions.add(opcion2.text.toString())
            if (opcion3.isChecked) selectedOptions.add(opcion3.text.toString())
            if (opcion4.isChecked) selectedOptions.add(opcion4.text.toString())
            val opcionesCorrectas = listOf("opc1", "opc3")
            verificarSeleccion(selectedOptions, opcionesCorrectas)
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
        // Agregar imágenes a las opciones
        val opciones = arrayOf(opcion1, opcion2, opcion3, opcion4)
        val recursos = arrayOf(R.drawable.arbol12, R.drawable.libro12, R.drawable.maleta12, R.drawable.cometa12)
        // Configurar iconos
        for (i in opciones.indices) {
            TamImg(opciones[i], recursos[i], 230)
        }
        Button1.setOnClickListener {
            // Crear una lista para guardar las opciones seleccionadas
            val selectedOptions = mutableListOf<String>()

            if (opcion1.isChecked) selectedOptions.add(opcion1.text.toString())
            if (opcion2.isChecked) selectedOptions.add(opcion2.text.toString())
            if (opcion3.isChecked) selectedOptions.add(opcion3.text.toString())
            if (opcion4.isChecked) selectedOptions.add(opcion4.text.toString())
            val opcionesCorrectas = listOf("opc3", "opc4")

            verificarSeleccion(selectedOptions, opcionesCorrectas)
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
        // Agregar imágenes a las opciones
        val opciones = arrayOf(opcion1, opcion2, opcion3, opcion4)
        val recursos = arrayOf(R.drawable.pato12, R.drawable.gato12, R.drawable.cama12, R.drawable.maleta12)

        // Configurar iconos
        for (i in opciones.indices) {
            TamImg(opciones[i], recursos[i], 230)
        }
        Button1.setOnClickListener {
            // Crear una lista para guardar las opciones seleccionadas
            val selectedOptions = mutableListOf<String>()

            if (opcion1.isChecked) selectedOptions.add(opcion1.text.toString())
            if (opcion2.isChecked) selectedOptions.add(opcion2.text.toString())
            if (opcion3.isChecked) selectedOptions.add(opcion3.text.toString())
            if (opcion4.isChecked) selectedOptions.add(opcion4.text.toString())
            val opcionesCorrectas = listOf("opc1", "opc2")

            verificarSeleccion(selectedOptions, opcionesCorrectas)
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
        // Agregar imágenes a las opciones
        val opciones = arrayOf(opcion1, opcion2, opcion3, opcion4)
        val recursos = arrayOf(R.drawable.casa12, R.drawable.camion12, R.drawable.avion12, R.drawable.manzana12)

        // Configurar iconos
        for (i in opciones.indices) {
            TamImg(opciones[i], recursos[i], 230)
        }
        Button1.setOnClickListener {
            // Crear una lista para guardar las opciones seleccionadas
            val selectedOptions = mutableListOf<String>()

            if (opcion1.isChecked) selectedOptions.add(opcion1.text.toString())
            if (opcion2.isChecked) selectedOptions.add(opcion2.text.toString())
            if (opcion3.isChecked) selectedOptions.add(opcion3.text.toString())
            if (opcion4.isChecked) selectedOptions.add(opcion4.text.toString())
            val opcionesCorrectas = listOf("opc2", "opc3")
            verificarSeleccion(selectedOptions, opcionesCorrectas)
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
        // Agregar imágenes a las opciones
        val opciones = arrayOf(opcion1, opcion2, opcion3, opcion4)
        val recursos = arrayOf(R.drawable.oreja12, R.drawable.balon12, R.drawable.llanta12, R.drawable.oveja12)

        // Configurar iconos
        for (i in opciones.indices) {
            TamImg(opciones[i], recursos[i], 230)
        }
        Button1.setOnClickListener {
            // Crear una lista para guardar las opciones seleccionadas
            val selectedOptions = mutableListOf<String>()

            if (opcion1.isChecked) selectedOptions.add(opcion1.text.toString())
            if (opcion2.isChecked) selectedOptions.add(opcion2.text.toString())
            if (opcion3.isChecked) selectedOptions.add(opcion3.text.toString())
            if (opcion4.isChecked) selectedOptions.add(opcion4.text.toString())
            val opcionesCorrectas = listOf("opc1", "opc4")

            verificarSeleccion(selectedOptions, opcionesCorrectas)
        }
    }
    private fun verificarSeleccion(selectedOptions: List<String>, opcionesCorrectas: List<String>) {
        if (selectedOptions.size == 2) {
            // Verificar si ambas opciones seleccionadas son las correctas
            if (selectedOptions.containsAll(opcionesCorrectas)) {
                mostrarDialogoFelicitaciones()
            } else {
                mostrarDialogomal()
            }
        } else {
            // Mostrar mensaje si no se seleccionaron exactamente dos opciones
            Toast.makeText(this, "Por favor selecciona exactamente dos opciones", Toast.LENGTH_SHORT).show()
        }
    }
    private fun TamImg(opcion: CheckBox, recursoId: Int, tamano: Int) {
        // Usar el recurso del drawable
        val drawable = resources.getDrawable(recursoId, null)
        drawable.setBounds(0, 0, tamano, tamano) // Ajustar el tamaño de la imagen
        opcion.setCompoundDrawables(drawable, null, null, null) // Establecer el ícono
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