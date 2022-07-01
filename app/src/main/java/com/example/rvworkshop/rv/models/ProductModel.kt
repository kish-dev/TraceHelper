package com.example.rvworkshop.rv.models

import com.example.rvworkshop.R

class ProductModel(
    val images: List<Int>,
    val price: String,
    val title: String,
    val description: String
): BaseRvModel() {
    override val viewType: Int = R.layout.product_view_holder
    override val spanSize: Int = 6
}