package com.netweb.netwebbharat.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.netweb.netwebbharat.R

class SpinnerAdapter(
    context: Context,
    private val itemList: List<String>
) : ArrayAdapter<String>(context, 0, itemList) {
    private val layoutInflater: LayoutInflater = LayoutInflater.from(context)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        return initView(position, convertView, parent)
    }

    override fun getDropDownView(position: Int, convertView: View?, parent: ViewGroup): View {
        return initView(position, convertView, parent)
    }

    private fun initView(position: Int, convertView: View?, parent: ViewGroup): View {
        val country = getItem(position)
        val view: View =
            layoutInflater.inflate(R.layout.simple_spinner_dropdown_item, parent, false)
        val text = view.findViewById<TextView>(R.id.spinner_text)
        text.text = itemList[position]
        return view
    }


}
