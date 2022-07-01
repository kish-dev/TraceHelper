package com.example.rvworkshop.rv.vh

import android.view.View
import android.widget.TextView
import com.example.rvworkshop.rv.models.TextRvModel
import kotlinx.android.synthetic.main.text_view_holder.view.*

class TextViewHolder(
    override val containerView: View
): BaseViewHolder<TextRvModel>(containerView) {

    override fun bindModel(model: TextRvModel) {
        (containerView as? TextView)?.text = model.text
    }
}