package com.example.rvworkshop.rv.models

import com.example.rvworkshop.R

class ProductGrid2Model(
    val images: List<Int>,
    val properties: List<String>
): BaseRvModel() {
    override val viewType: Int = R.layout.product_grid2_view_holder
    override val spanSize: Int = 3
}