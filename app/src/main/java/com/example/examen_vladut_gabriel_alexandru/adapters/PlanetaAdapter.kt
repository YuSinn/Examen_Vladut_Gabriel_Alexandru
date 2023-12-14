package com.example.examen_vladut_gabriel_alexandru.adapters

import android.app.Activity
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.examen_vladut_gabriel_alexandru.R
import com.example.examen_vladut_gabriel_alexandru.model.Planeta

class PlanetaAdapter(private val activity: Activity, private val listaPlanetas:ArrayList<Planeta>): BaseAdapter() {

    class ViewHolder{
        lateinit var textViewNombre: TextView
        lateinit var textViewTipo: TextView
        lateinit var imageViewPlaneta: ImageView
    }
    override fun getCount(): Int {
        return listaPlanetas.size
    }

    override fun getItem(position: Int): Planeta{
        return listaPlanetas.get(position)
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, converView: View?, parent: ViewGroup?): View {
        var myView = converView
        var viewHolder = ViewHolder()

        if(myView == null) {

            var inflater = activity.layoutInflater
            myView = inflater.inflate(R.layout.item_planeta_layout, null)
            viewHolder.imageViewPlaneta = myView.findViewById(R.id.imageViewPlaneta)
            viewHolder.textViewNombre = myView.findViewById<TextView>(R.id.textViewNombre)
            viewHolder.textViewTipo = myView.findViewById<TextView>(R.id.textViewTipo)
            myView.setTag(viewHolder)
        }else{
            viewHolder = myView.tag as ViewHolder

        }
        //viewHolder.imageViewPlaneta.setImageIcon(listaPlanetas[position].nombre)
        viewHolder.textViewNombre.text = listaPlanetas[position].nombre
        viewHolder.textViewTipo.text = listaPlanetas[position].tipo
        return myView!!
    }
}