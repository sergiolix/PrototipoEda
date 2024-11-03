package com.example.prototipoeda

import android.content.Intent
import android.os.Bundle
import android.graphics.Color
import android.widget.Button
import android.widget.GridLayout
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ejercicio4ctg1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_ejercicio4ctg1)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
            }
        val botonsiguiente = findViewById<Button>(R.id.BotonSiguiente)
        val numero: Int = intent.extras?.getInt("Numero") ?:1
        val gridLayout = findViewById<GridLayout>(R.id.letrasGrid)
        val botonValidar = findViewById<Button>(R.id.ConfirmarBoton)
        val TextoTitulo = findViewById<TextView>(R.id.textosonido)
        val seleccionadas = mutableListOf<Int>()
        val textobar = findViewById<TextView>(R.id.TextoBar)
        val botonatras = findViewById<ImageButton>(R.id.BotonAtras1)

        textobar.text = "Ejercicio $numero"

        val letras = when (numero) {
            1 -> {
                TextoTitulo.text = "Busca la letra n"
                val letrasEj1 = mutableListOf<Char>()
                repeat(15) { letrasEj1.add('m') }  // 13 letras 'm'
                repeat(1) { letrasEj1.add('n') }   // 3 letras 'n'
                letrasEj1.shuffle()
                letrasEj1
            }
            2 -> {
                TextoTitulo.text = "Busca la letra d"
                val letrasEj2 = mutableListOf<Char>()
                repeat(15) { letrasEj2.add('b') }  // 13 letras 'b'
                repeat(1) { letrasEj2.add('d') }   // 3 letras 'p'
                letrasEj2.shuffle()
                letrasEj2
            }
            3 -> {
                TextoTitulo.text = "Busca la letra q"
                val letrasEj3 = mutableListOf<Char>()
                repeat(15) { letrasEj3.add('p') }  // 13 letras 'd'
                repeat(1) { letrasEj3.add('q') }   // 3 letras 'p'
                letrasEj3.shuffle()
                letrasEj3
            }
            4 -> {
                TextoTitulo.text = "Busca la letra b"
                val letrasEj3 = mutableListOf<Char>()
                repeat(15) { letrasEj3.add('p') }  // 13 letras 'd'
                repeat(1) { letrasEj3.add('b') }   // 3 letras 'p'
                letrasEj3.shuffle()
                letrasEj3
            }
            5 -> {
                TextoTitulo.text = "Busca la letra n"
                val letrasEj3 = mutableListOf<Char>()
                repeat(15) { letrasEj3.add('u') }  // 13 letras 'd'
                repeat(1) { letrasEj3.add('n') }   // 3 letras 'p'
                letrasEj3.shuffle()
                letrasEj3
            }
            6 -> {
                TextoTitulo.text = "Busca la letra d"
                val letrasEj3 = mutableListOf<Char>()
                repeat(15) { letrasEj3.add('q') }  // 13 letras 'd'
                repeat(1) { letrasEj3.add('d') }   // 3 letras 'p'
                letrasEj3.shuffle()
                letrasEj3
            }
            else -> emptyList()
        }
        // Manejamos la selección de las letras
        for (i in letras.indices) {
            val button = Button(this)
            button.text = letras[i].toString().lowercase()
            button.isAllCaps = false
            // Al hacer clic en un botón, se selecciona o deselecciona
            button.setOnClickListener {
                if (seleccionadas.contains(i)) {
                    // Deseleccionar
                    button.setBackgroundColor(Color.LTGRAY)
                    seleccionadas.remove(i)
                } else {
                    // Seleccionar
                    button.setBackgroundColor(Color.GREEN)
                    seleccionadas.add(i)
                }
            }

            // Agregar botón al GridLayout
            gridLayout.addView(button)
        }

        botonValidar.setOnClickListener {
            val letrasSeleccionadas = seleccionadas.map { letras[it] }

            // Ajustar la validación según el ejercicio
            val esCorrecto = when (numero) {
                1 -> letrasSeleccionadas.count { it == 'n' } == 1 && letrasSeleccionadas.all { it == 'n' }
                2 -> letrasSeleccionadas.count { it == 'd' } == 1 && letrasSeleccionadas.all { it == 'd' }
                3 -> letrasSeleccionadas.count { it == 'q' } == 1 && letrasSeleccionadas.all { it == 'q' }
                4 -> letrasSeleccionadas.count { it == 'b' } == 1 && letrasSeleccionadas.all { it == 'b' }
                5 -> letrasSeleccionadas.count { it == 'n' } == 1 && letrasSeleccionadas.all { it == 'n' }
                6 -> letrasSeleccionadas.count { it == 'd' } == 1 && letrasSeleccionadas.all { it == 'd' }
                else -> false
            }
            if (esCorrecto) {
                DialogUtils.mostrarDialogoPersonalizado(this, "correcto",R.drawable.feliz)
            } else {
                DialogUtils.mostrarDialogoPersonalizado(this, "Incorrecto Sigue Intentando",R.drawable.triste)
            }
        }

        botonsiguiente.setOnClickListener{
            if(numero < 6){
                val intent = Intent(this, ejercicio4ctg1::class.java)
                intent.putExtra("Numero", numero + 1)
                startActivity(intent)
            }else{
                Toast.makeText(this, "no hay mas ejercicios", Toast.LENGTH_SHORT).show()
            }
        }
        botonatras.setOnClickListener{
            val intent = Intent(this,Categoria1::class.java)
            startActivity(intent)
        }
    }


}