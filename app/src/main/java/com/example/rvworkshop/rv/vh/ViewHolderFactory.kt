package com.example.rvworkshop.rv.vh

import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.rvworkshop.R
import com.example.rvworkshop.rv.models.ProductGrid2Generator
import com.example.rvworkshop.rv.vh.product.Grid2ProductViewHolder
import com.example.rvworkshop.rv.vh.product.ProductViewHolder

class ViewHolderFactory {

    fun create(parentView: ViewGroup, viewType: Int): BaseViewHolder<*> {
        return when(viewType) {
            R.layout.text_view_holder -> TextViewHolder(
                LayoutInflater.from(parentView.context).inflate(viewType, parentView, false)
            )
            R.layout.product_view_holder -> ProductViewHolder(
                LayoutInflater.from(parentView.context).inflate(viewType, parentView, false)
            )
            R.layout.product_grid2_view_holder -> Grid2ProductViewHolder(
                LayoutInflater.from(parentView.context).inflate(viewType, parentView, false)
            )

            else -> throw Exception("")
        }
    }
}