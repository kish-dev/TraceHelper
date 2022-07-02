package com.example.rvworkshop.rv.vh.product.vh

import android.view.ViewGroup
import androidx.appcompat.widget.AppCompatTextView
import androidx.recyclerview.widget.RecyclerView
import com.example.rvworkshop.rv.ViewTypes
import com.example.rvworkshop.rv.utils.TraceHelper

class PropertiesAdapter(
    private var items: List<String> = listOf()
): RecyclerView.Adapter<PropertyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PropertyViewHolder {
        lateinit var vh: PropertyViewHolder
        TraceHelper.trace("createVh Property") {
            vh = PropertyViewHolder(
                AppCompatTextView(parent.context).apply {
                    layoutParams = RecyclerView.LayoutParams(
                        RecyclerView.LayoutParams.MATCH_PARENT,
                        RecyclerView.LayoutParams.WRAP_CONTENT
                    )
                }
            )
        }
        return vh
    }

    override fun onBindViewHolder(holder: PropertyViewHolder, position: Int) {
        holder.bind(items[position])
    }

    override fun getItemCount(): Int = items.size

    fun submitList(newList: List<String>) {
        items = newList
        notifyDataSetChanged()
    }

    override fun getItemViewType(position: Int): Int {
        return ViewTypes.PROPERTY_VIEW_TYPE
    }
}