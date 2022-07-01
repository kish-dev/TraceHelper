package com.example.rvworkshop.rv

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.rvworkshop.rv.models.BaseRvModel
import com.example.rvworkshop.rv.vh.BaseViewHolder
import com.example.rvworkshop.rv.vh.ViewHolderFactory

class SampleAdapter(
    var items: List<BaseRvModel> = emptyList(),
    private val vhFactory: ViewHolderFactory = ViewHolderFactory()
): RecyclerView.Adapter<BaseViewHolder<*>>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder<*> {
        return vhFactory.create(parent, viewType)
    }

    override fun onBindViewHolder(holder: BaseViewHolder<*>, position: Int) {
        holder.bind(items[position])
    }

    override fun getItemCount(): Int = items.size

    override fun getItemViewType(position: Int): Int = items[position].viewType

    fun submitList(newList: List<BaseRvModel>) {
        items = newList
        notifyDataSetChanged()
    }
}