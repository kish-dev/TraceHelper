package com.example.rvworkshop.rv.vh.product

import android.view.View
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.rvworkshop.rv.models.ProductGrid2Model
import com.example.rvworkshop.rv.models.ProductModel
import com.example.rvworkshop.rv.utils.TraceHelper
import com.example.rvworkshop.rv.vh.BaseViewHolder
import com.example.rvworkshop.rv.vh.image.ImagesAdapter
import com.example.rvworkshop.rv.vh.product.vh.PropertiesAdapter
import kotlinx.android.synthetic.main.image_item.view.*
import kotlinx.android.synthetic.main.product_grid2_view.view.*
import kotlinx.android.synthetic.main.product_grid2_view_holder.view.*
import kotlinx.android.synthetic.main.product_view_holder.view.*
import kotlinx.android.synthetic.main.product_view_holder.view.images
import kotlinx.android.synthetic.main.product_view_holder.view.productButton

class Grid2ProductViewHolder(
    override val containerView: View,
    sharedRecyclerViewPool: RecyclerView.RecycledViewPool
) : BaseViewHolder<ProductGrid2Model>(containerView) {

    private val adapter = ImagesAdapter()
    private val propAdapter = PropertiesAdapter()
    private var currentModel: ProductGrid2Model? = null

    init {
        containerView.images.setRecycledViewPool(sharedRecyclerViewPool)
        containerView.images.adapter = adapter
        containerView.images.layoutManager = LinearLayoutManager(
            containerView.context,
            LinearLayoutManager.HORIZONTAL,
            false
        ).apply {
            recycleChildrenOnDetach = true
        }

        containerView.properties.setRecycledViewPool(sharedRecyclerViewPool)
        containerView.properties.adapter = propAdapter
        containerView.properties.layoutManager = LinearLayoutManager(
            containerView.context
        )

        containerView.productButton.setOnClickListener {
            Toast.makeText(
                containerView.context,
                "Product clicked ${currentModel?.viewType ?: ""}", Toast.LENGTH_LONG
            ).show()
        }
    }

    override fun bindModel(model: ProductGrid2Model) {
        currentModel = model
        adapter.submitList(model.images)
        propAdapter.submitList(model.properties)
//        containerView.apply {

//            properties.removeAllViews()
//
//            model.properties.forEach {
//                properties.addView(
//                    generateTextView(it),
//                    LinearLayout.LayoutParams(
//                        LinearLayout.LayoutParams.MATCH_PARENT,
//                        LinearLayout.LayoutParams.WRAP_CONTENT
//                    )
//                )
//            }
//        }
    }
//
//    fun generateTextView(property: String) = TextView(containerView.context).apply {
//        text = property
//    }
}