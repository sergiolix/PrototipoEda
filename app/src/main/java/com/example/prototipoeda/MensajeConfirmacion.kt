package com.example.prototipoeda

import android.app.AlertDialog
import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView

object DialogUtils {

    fun mostrarDialogoPersonalizado(
        context: Context,
        mensaje: String,
        imagenResId: Int,
        onPositiveButtonClick: (() -> Unit)? = null
    ) {
        val inflater: LayoutInflater = LayoutInflater.from(context)
        val dialogView = inflater.inflate(R.layout.mensajeconfirmacion, null)

        val texto: TextView = dialogView.findViewById(R.id.mensajealerta)
        val imagen: ImageView = dialogView.findViewById(R.id.imagenMensajeAlerta)

        val params: ViewGroup.LayoutParams = imagen.layoutParams
        params.width = 300
        params.height = 300
        imagen.layoutParams = params

        texto.text = mensaje
        imagen.setImageResource(imagenResId)

        val builder = AlertDialog.Builder(context)
        builder.setView(dialogView)
        builder.setPositiveButton("OK") { dialog, _ ->
            dialog.dismiss()
            onPositiveButtonClick?.invoke()
        }

        val dialog: AlertDialog = builder.create()
        dialog.show()
    }
}
