package com.example.rvworkshop.rv.vh.product

import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.rvworkshop.rv.models.ProductModel
import com.example.rvworkshop.rv.vh.BaseViewHolder
import com.example.rvworkshop.rv.vh.image.ImagesAdapter
import kotlinx.android.synthetic.main.product_view_holder.view.*

class ProductViewHolder(
    override val containerView: View
) : BaseViewHolder<ProductModel>(containerView) {

    private val adapter = ImagesAdapter()

    init {
        containerView.images.adapter = adapter
        containerView.images.layoutManager = LinearLayoutManager(
            containerView.context,
            LinearLayoutManager.HORIZONTAL,
            false
        )
    }

    override fun bindModel(model: ProductModel) {
        adapter.submitList(model.images)

        containerView.apply {
            title.text = model.title
            price.text = model.price
            description.text = model.description
            productButton.setOnClickListener {
                Toast.makeText(context, "Product clicked", Toast.LENGTH_LONG).show()
            }
        }
    }
}