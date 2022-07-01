package com.example.rvworkshop.rv.vh

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.rvworkshop.R
import com.example.rvworkshop.rv.models.BaseRvModel
import com.example.rvworkshop.rv.utils.TraceHelper
import kotlinx.android.extensions.LayoutContainer

abstract class BaseViewHolder<T : BaseRvModel>(
    override val containerView: View
) : RecyclerView.ViewHolder(containerView), LayoutContainer {

    fun bind(model: BaseRvModel) {
        (model as? T)?.let {
            bindModel(it)
        }

    }

    protected abstract fun bindModel(model: T)
}