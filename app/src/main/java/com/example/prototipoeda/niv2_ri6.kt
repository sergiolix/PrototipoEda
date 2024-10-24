package com.example.prototipoeda
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Button
import android.widget.CheckBox
import android.widget.LinearLayout
import androidx.appcompat.app.AlertDialog
import android.widget.TextView
import android.widget.Toast
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


class niv2_ri6 : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.nivel2_ri)
        // Obtener los elementos de la interfaz
        val opcion1 = findViewById<CheckBox>(R.id.opc1)
        val opcion2 = findViewById<CheckBox>(R.id.opc2)
        val opcion3 = findViewById<CheckBox>(R.id.opc3)
        val opcion4 = findViewById<CheckBox>(R.id.opc4)
        val texto1 = findViewById<TextView>(R.id.text_1)
        val Button1 = findViewById<Button>(R.id.button_1)
        val Button2 = findViewById<Button>(R.id.button_2)
        Button2.setOnClickListener{
            val intent = Intent(this,niv2_rf1::class.java)
            startActivity(intent)
        }

        texto1.text = "seleccione las imagenes que corresponden a palabras con silaba inicial parecida:"
        // Agregar imágenes
        opcion1.setCompoundDrawablesWithIntrinsicBounds(R.drawable.tetero, 0, 0, 0)
        opcion2.setCompoundDrawablesWithIntrinsicBounds(R.drawable.arbol, 0, 0, 0)
        opcion3.setCompoundDrawablesWithIntrinsicBounds(R.drawable.rana, 0, 0, 0)
        opcion4.setCompoundDrawablesWithIntrinsicBounds(R.drawable.raton, 0, 0, 0)

        // Ajustar tamaño de los íconos
        val drawable1 = resources.getDrawable(R.drawable.tetero, null)
        drawable1.setBounds(0, 0, 230, 230)
        opcion1.setCompoundDrawables(drawable1, null, null, null)

        val drawable2 = resources.getDrawable(R.drawable.arbol, null)
        drawable2.setBounds(0, 0, 230, 230)
        opcion2.setCompoundDrawables(drawable2, null, null, null)

        val drawable3 = resources.getDrawable(R.drawable.rana, null)
        drawable3.setBounds(0, 0, 230, 230)
        opcion3.setCompoundDrawables(drawable3, null, null, null)

        val drawable4 = resources.getDrawable(R.drawable.raton, null)
        drawable4.setBounds(0, 0, 230, 230)
        opcion4.setCompoundDrawables(drawable4, null, null, null)
        Button1.setOnClickListener {
            // Crear una lista para guardar las opciones seleccionadas
            val selectedOptions = mutableListOf<String>()

            if (opcion1.isChecked) selectedOptions.add(opcion1.text.toString())
            if (opcion2.isChecked) selectedOptions.add(opcion2.text.toString())
            if (opcion3.isChecked) selectedOptions.add(opcion3.text.toString())
            if (opcion4.isChecked) selectedOptions.add(opcion4.text.toString())

            // Verificar si el usuario seleccionó exactamente dos opciones
            if (selectedOptions.size == 2) {
                // Verificar si ambas opciones seleccionadas son correctas
                if (selectedOptions.contains("opc3") && selectedOptions.contains("opc4")) {
                    mostrarDialogoFelicitaciones()
                } else {
                    mostrarDialogomal()
                }
            } else {
                // Mostrar mensaje si no se seleccionaron exactamente dos opciones
                Toast.makeText(this, "Por favor selecciona exactamente dos opciones", Toast.LENGTH_SHORT).show()
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