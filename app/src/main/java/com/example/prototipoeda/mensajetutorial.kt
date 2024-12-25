package com.example.prototipoeda

import android.app.AlertDialog
import android.content.Context
import android.media.MediaPlayer

fun mostrarTutorial(
    context: Context,
    titulo: String,
    mensaje: String,
    nombreArchivoAudio: Int,
    clave: String
) {
    // Nombre del archivo de SharedPreferences y clave para el tutorial
    val sharedPreferences = context.getSharedPreferences("misPreferencias", Context.MODE_PRIVATE)
    val tutorialMostrado = sharedPreferences.getBoolean(clave, false)

    // Si el usuario no ha marcado que no quiere ver el tutorial, lo mostramos
    if (!tutorialMostrado) {
        val builder = AlertDialog.Builder(context)
        builder.setTitle(titulo)
        builder.setMessage(mensaje)

        // Botón para cerrar el tutorial sin marcar que no se muestre en el futuro
        builder.setPositiveButton("Entendido") { dialog, _ ->
            dialog.dismiss()
        }

        // Botón para no mostrar el tutorial en el futuro
        builder.setNegativeButton("No mostrar de nuevo") { dialog, _ ->
            // Guarda en SharedPreferences que no se debe mostrar de nuevo
            val editor = sharedPreferences.edit()
            editor.putBoolean(clave, true)
            editor.apply()
            dialog.dismiss()
        }

        // Botón para reproducir el audio
        builder.setNeutralButton("Ayuda Auditiva") { _, _ ->
            // Reproducir el audio cuando se hace clic en el botón
            val mediaPlayer = MediaPlayer.create(context, nombreArchivoAudio)
            mediaPlayer.start()
        }

        // Muestra el AlertDialog
        val dialog = builder.create()
        dialog.show()
    }
}