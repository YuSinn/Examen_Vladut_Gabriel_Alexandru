package com.example.examen_vladut_gabriel_alexandru

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ListView
import android.widget.Toast
import com.example.examen_vladut_gabriel_alexandru.adapters.PlanetaAdapter
import com.example.examen_vladut_gabriel_alexandru.model.Planeta

class MainActivity : AppCompatActivity() {
    var planetas : List<Pair<String,String>> = listOf()
    var descubrimiento : List<Int> = listOf(-1,-1,0,-1,-1,-1,1781,1846)
    var satelites : List<Int> = listOf(0,0,1,2,-79,82,27,14)
    var presencia : List<String> = listOf("No","No","No","No","Si","Si","Si","Si")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var listViewItems: ListView = findViewById(R.id.listaViewItems)


        planetas = listOf(
            Pair("Mercurio","Terrestre"),
            Pair("Venus","Terrestre"),
            Pair("Tierra","Terrestre"),
            Pair("Marte","Terrestre"),
            Pair("Jupiter","Gigante gaseoso"),
            Pair("Saturno","Gigante gaseoso"),
            Pair("Urano","Gigante helado"),
            Pair("Neptuno","Gigante helado"))
        var listaPlanetas = leerPlanetas()

        var planetaAdapter = PlanetaAdapter(this,listaPlanetas)

        listViewItems.adapter = planetaAdapter

        listViewItems.onItemClickListener = AdapterView.OnItemClickListener { parent, view, position, id ->
            Toast.makeText(
                applicationContext,
                "Nombre " + listaPlanetas[position].nombre
                        + " Tipo " + listaPlanetas[position].tipo,
                Toast.LENGTH_SHORT
            ).show()
            var mi_intent: Intent = Intent(this, planeta::class.java)

            mi_intent.putExtra("clasePlaneta", listaPlanetas[position].getBundle())
            startActivity(mi_intent)
        }

    }
    private fun leerPlanetas(): ArrayList<Planeta>{
        var lista = ArrayList<Planeta>()
        var position = 0
        for((nombre,tipo) in planetas){
            var planeta = Planeta(nombre,tipo,descubrimiento[position], satelites[position],presencia[position])
            lista.add(planeta)
            position++
        }
        return lista
    }
}