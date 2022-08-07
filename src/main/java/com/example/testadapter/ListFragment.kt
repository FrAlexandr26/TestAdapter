package com.example.testadapter

import android.app.Activity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ListView
import android.widget.Toast
import androidx.fragment.app.Fragment

class ListFragment : Fragment(){
    private lateinit var initialsList: ArrayList<Initials>
    private lateinit var list_container: ListView

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_layout, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        list_container = view.findViewById(R.id.target_list)
        initialsList = ArrayList()
        initialsList.add(Initials("Александр", "Бондаренко"))
        initialsList.add(Initials("Александр", "Ворожилов"))
        initialsList.add(Initials("Борис", "Вороновский"))
        initialsList.add(Initials("Валерий", "Грачевский"))
        initialsList.add(Initials("Виктор", "Домостов"))
        initialsList.add(Initials("Дмитрий", "Архипов"))

        list_container.adapter = InitialsAdapter(requireActivity(), R.layout.list_element, initialsList)
        list_container.setOnItemClickListener { parent, view, position, id ->
            Toast.makeText(context, initialsList[position].name + " " + initialsList[position].surname, Toast.LENGTH_SHORT).show()
        }
    }
}