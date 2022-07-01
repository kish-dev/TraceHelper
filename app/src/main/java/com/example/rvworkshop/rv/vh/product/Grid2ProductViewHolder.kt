package com.example.rvworkshop.rv.vh.product

import android.view.View
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.rvworkshop.rv.models.ProductGrid2Model
import com.example.rvworkshop.rv.models.ProductModel
import com.example.rvworkshop.rv.vh.BaseViewHolder
import com.example.rvworkshop.rv.vh.image.ImagesAdapter
import kotlinx.android.synthetic.main.product_grid2_view_holder.view.*
import kotlinx.android.synthetic.main.product_view_holder.view.*
import kotlinx.android.synthetic.main.product_view_holder.view.images
import kotlinx.android.synthetic.main.product_view_holder.view.productButton

class Grid2ProductViewHolder(
    override val containerView: View
) : BaseViewHolder<ProductGrid2Model>(containerView) {

    private val adapter = ImagesAdapter()

    init {
        containerView.images.adapter = adapter
        containerView.images.layoutManager = LinearLayoutManager(
            containerView.context,
            LinearLayoutManager.HORIZONTAL,
            false
        )
    }

    override fun bindModel(model: ProductGrid2Model) {
        adapter.submitList(model.images)

        containerView.apply {

            properties.removeAllViews()

            model.properties.forEach {
                properties.addView(
                    generateTextView(it),
                    LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.MATCH_PARENT,
                        LinearLayout.LayoutParams.WRAP_CONTENT
                    )
                )
            }

            productButton.setOnClickListener {
                Toast.makeText(context, "Product clicked", Toast.LENGTH_LONG).show()
            }
        }
    }

    fun generateTextView(property: String) = TextView(containerView.context).apply {
        text = property
    }
}