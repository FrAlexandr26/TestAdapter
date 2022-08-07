package com.example.testadapter

import android.app.Activity
import android.content.Context


import android.view.LayoutInflater
import android.view.View

import android.view.ViewGroup
import android.widget.ArrayAdapter

import android.widget.TextView

class InitialsAdapter (private val context: Activity, private val layoutResourse: Int, private val initialsList: ArrayList<Initials>) : ArrayAdapter<Initials>(context, layoutResourse, initialsList){

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {


        var inflater: LayoutInflater = LayoutInflater.from(context)

        var view : View = inflater.inflate(layoutResourse, null)

        val textName : TextView = view.findViewById(R.id.name)
        val textSurname : TextView = view.findViewById(R.id.surname)

        textName.text = initialsList[position].name
        textSurname.text = initialsList[position].surname


        return view
    }
}