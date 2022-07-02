package com.example.rvworkshop.rv.vh.product.vh

import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.extensions.LayoutContainer

class PropertyViewHolder(
    override val containerView: TextView
): RecyclerView.ViewHolder(containerView), LayoutContainer {

    fun bind(text: String) {
        containerView.text = text
    }
}