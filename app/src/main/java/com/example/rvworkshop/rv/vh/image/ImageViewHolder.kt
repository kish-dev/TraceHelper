package com.example.rvworkshop.rv.vh.image

import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.extensions.LayoutContainer
import kotlinx.android.synthetic.main.image_item.view.*

class ImageViewHolder(
    override val containerView: View
): RecyclerView.ViewHolder(containerView), LayoutContainer {

    fun bind(imageId: Int) {
        containerView.apply {
            image.setImageResource(imageId)
            image.setOnClickListener {
                Toast.makeText(context, "Image clicked", Toast.LENGTH_LONG).show()
            }
        }
    }
}