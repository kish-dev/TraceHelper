package com.example.rvworkshop.rv.vh.image

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.rvworkshop.R
import com.example.rvworkshop.rv.ViewTypes
import com.example.rvworkshop.rv.utils.TraceHelper

class ImagesAdapter(
    var images: List<Int> = emptyList()
): RecyclerView.Adapter<ImageViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageViewHolder {
        lateinit var vh: ImageViewHolder
        TraceHelper.trace("createVh Image") {
            vh = ImageViewHolder(
                LayoutInflater.from(parent.context).inflate(R.layout.image_item, parent, false)
            )
        }
        return vh
    }

    override fun onBindViewHolder(holder: ImageViewHolder, position: Int) {
        holder.bind(images[position])
    }

    override fun getItemCount(): Int = images.size

    fun submitList(newImages: List<Int>) {
        images = newImages
        notifyDataSetChanged()
    }

    override fun getItemViewType(position: Int): Int {
        return ViewTypes.IMAGE_VIEW_TYPE
    }
}