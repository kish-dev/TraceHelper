package com.example.rvworkshop.rv

import android.view.ViewGroup
import androidx.core.os.trace
import androidx.recyclerview.widget.RecyclerView
import com.example.rvworkshop.rv.models.BaseRvModel
import com.example.rvworkshop.rv.utils.TraceHelper
import com.example.rvworkshop.rv.vh.BaseViewHolder
import com.example.rvworkshop.rv.vh.ViewHolderFactory
import com.example.rvworkshop.rv.vh.product.Grid2ProductViewHolder

class SampleAdapter(
    var items: List<BaseRvModel> = emptyList(),
    private val vhFactory: ViewHolderFactory = ViewHolderFactory()
): RecyclerView.Adapter<BaseViewHolder<*>>() {

    private val nestedRecyclerViewPool = RecyclerView.RecycledViewPool().apply {
        this.setMaxRecycledViews(ViewTypes.IMAGE_VIEW_TYPE, 25)
        this.setMaxRecycledViews(ViewTypes.PROPERTY_VIEW_TYPE, 25)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder<*> {
        return vhFactory.create(parent, viewType, nestedRecyclerViewPool)
    }

    override fun onBindViewHolder(holder: BaseViewHolder<*>, position: Int) {
        TraceHelper.trace("bind vh ${holder.javaClass.canonicalName.toString()}") {
            holder.bind(items[position])
        }
    }

    override fun getItemCount(): Int = items.size

    override fun getItemViewType(position: Int): Int = items[position].viewType

    fun submitList(newList: List<BaseRvModel>) {
        items = newList
        notifyDataSetChanged()
    }
}