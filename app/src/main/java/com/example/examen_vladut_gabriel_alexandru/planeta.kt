package com.example.examen_vladut_gabriel_alexandru

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.examen_vladut_gabriel_alexandru.model.Planeta

class planeta : AppCompatActivity() {
    lateinit var textViewNombre2: TextView
    lateinit var textViewDescubrimiento: TextView
    lateinit var textViewSatelite: TextView
    lateinit var textViewAnillos: TextView
    lateinit var textViewTipo2: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_planeta)

        textViewNombre2 = findViewById<TextView>(R.id.textViewNombre2)
        textViewDescubrimiento = findViewById<TextView>(R.id.textViewDescubrimiento)
        textViewSatelite = findViewById<TextView>(R.id.textViewSatelite)
        textViewAnillos = findViewById<TextView>(R.id.textViewAnillos)
        textViewTipo2 = findViewById<TextView>(R.id.textViewTipo2)

        var nombre = intent.getStringExtra("nombre")
        var tipo = intent.getStringExtra("tipo")
        var anillos = intent.getStringExtra("anillos")
        var satelite = intent.getStringExtra("numeroSatelites")!!
        var descubrimiento = intent.getStringExtra("descubrimiento")!!

        var bundlePlaneta = intent.getBundleExtra("clasePlaneta")
        var planeta = Planeta(bundlePlaneta!!)
        //falta mostrar los text view


    }
}