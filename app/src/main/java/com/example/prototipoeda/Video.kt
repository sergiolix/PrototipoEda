package com.example.prototipoeda

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.MediaController
import android.widget.VideoView
import androidx.appcompat.app.AppCompatActivity

class Video : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.introvid)
        val Numvideo = intent.getIntExtra("Video", 1)
        val vid = findViewById<VideoView>(R.id.videoView_video)
        val buttonok = findViewById<Button>(R.id.buttonok)
        val mc = MediaController(this)

        when(Numvideo){
            1 -> {val path = Uri.parse("android.resource://com.example.prototipoeda/" + R.raw.rf)
                vid.setMediaController(mc)
                vid.setVideoURI(path)
                vid.start()}
            2 -> {val path = Uri.parse("android.resource://com.example.prototipoeda/" + R.raw.rf)
                vid.setMediaController(mc)
                vid.setVideoURI(path)
                vid.start()}
            3 -> {val path = Uri.parse("android.resource://com.example.prototipoeda/" + R.raw.rf)
                vid.setMediaController(mc)
                vid.setVideoURI(path)
                vid.start()}
            4 -> {val path = Uri.parse("android.resource://com.example.prototipoeda/" + R.raw.rf)
                vid.setMediaController(mc)
                vid.setVideoURI(path)
                vid.start()}
            5 -> {val path = Uri.parse("android.resource://com.example.prototipoeda/" + R.raw.rf)
                vid.setMediaController(mc)
                vid.setVideoURI(path)
                vid.start()}
        }

        buttonok.setOnClickListener{
            when(Numvideo){
                1 -> {
                    val intent1 = Intent(this , Ejercicio1ctg1::class.java)
                    intent1.putExtra("menu1", 1)
                    startActivity(intent1)
                }
                2 -> {
                    val intent1 = Intent(this , Ejercicio1ctg1::class.java)
                    intent1.putExtra("menu1", 2)
                    startActivity(intent1)
                }
                3 -> {
                    val intent = Intent(this , Ejercicio3ctg1::class.java)
                    startActivity(intent)
                }
                4 -> {
                    val intent = Intent(this , ejercicio4ctg1::class.java)
                    startActivity(intent)
                }
                5 -> {val intent = Intent(this , Ejercicio1ctg4::class.java)
                    startActivity(intent)
                }
            }

        }
    }
}