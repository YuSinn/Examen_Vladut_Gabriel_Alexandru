package com.example.examen_vladut_gabriel_alexandru.model

import android.os.Bundle

class Planeta {
    var nombre = ""
    var tipo = ""
    var descubrimiento = 0
    var numeroSatelites = 0
    var presenciaAnillos = ""

    constructor(nombre: String, tipo: String, descubrimiento: Int,numeroSatelites:Int, presenciaAnillos:String) {
        this.nombre = nombre
        this.tipo = tipo
        this.descubrimiento = descubrimiento
        this.numeroSatelites = numeroSatelites
        this.presenciaAnillos = presenciaAnillos
    }

    constructor(bundle: Bundle){
        this.nombre = bundle.getString("nombre")!!
        this.tipo = bundle.getString("tipo")!!
        this.descubrimiento = bundle.getInt("descubrimiento")
        this.numeroSatelites = bundle.getInt("numeroSatelites")
        this.presenciaAnillos = bundle.getString("presenciaAnillos")!!
    }
    fun getBundle(): Bundle?{
        var bundle = Bundle()

        bundle.putString("nombre",this.nombre)
        bundle.putString("apellido", this.tipo)
        bundle.putInt("descubrimiento",this.descubrimiento)
        bundle.putInt("numeroSatelites",this.numeroSatelites)
        bundle.putString("presenciaAnillos", this.presenciaAnillos)
        return bundle
    }
}