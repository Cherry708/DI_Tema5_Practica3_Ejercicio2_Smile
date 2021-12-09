package com.example.di_tema5_practica3_ejercicio2_smile

import android.annotation.SuppressLint
import android.graphics.drawable.AnimatedVectorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    @SuppressLint("UseCompatLoadingForDrawables")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val image = findViewById<ImageView>(R.id.imageView)

        val fab = findViewById(R.id.fab) as FloatingActionButton
        fab.setImageResource(R.drawable.cara_triste)
        var tristeToFeliz = true

        fab.setOnClickListener {
            if (tristeToFeliz) {
                val transformar =
                    getDrawable(R.drawable.triste_feliz_animacion) as AnimatedVectorDrawable
                image.setImageDrawable(transformar)
                transformar.start()
                tristeToFeliz = false
            } else {
                val transformar =
                    getDrawable(R.drawable.feliz_triste_animacion) as AnimatedVectorDrawable
                image.setImageDrawable(transformar)
                transformar.start()
                tristeToFeliz = true
            }
        }
    }
}