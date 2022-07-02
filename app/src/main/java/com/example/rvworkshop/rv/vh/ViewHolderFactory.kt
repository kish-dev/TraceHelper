package com.example.rvworkshop.rv.vh

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.rvworkshop.R
import com.example.rvworkshop.rv.utils.TraceHelper
import com.example.rvworkshop.rv.vh.product.Grid2ProductViewHolder
import com.example.rvworkshop.rv.vh.product.ProductViewHolder

class ViewHolderFactory {

    fun create(
        parentView: ViewGroup,
        viewType: Int,
        nestedRecyclerViewPool: RecyclerView.RecycledViewPool
    ): BaseViewHolder<*> {
        lateinit var vh: BaseViewHolder<*>
        when (viewType) {
            R.layout.text_view_holder -> {
                TraceHelper.trace("create TextViewHolder") {
                    vh = TextViewHolder(
                        LayoutInflater.from(parentView.context).inflate(viewType, parentView, false)
                    )
                }
            }

            R.layout.product_view_holder -> {
                TraceHelper.trace("create ProductViewHolder") {
                    vh = ProductViewHolder(
                        sharedViewPool = nestedRecyclerViewPool,
                        containerView = LayoutInflater.from(parentView.context).inflate(viewType, parentView, false)
                    )
                }
            }
            R.layout.product_grid2_view_holder -> {
                TraceHelper.trace("create Grid2ProductViewHolder") {
                    vh = Grid2ProductViewHolder(
                        containerView = LayoutInflater.from(parentView.context).inflate(viewType, parentView, false),
                        sharedRecyclerViewPool = nestedRecyclerViewPool
                    )
                }
            }

            else -> throw Exception("")
        }

        return vh
    }
}