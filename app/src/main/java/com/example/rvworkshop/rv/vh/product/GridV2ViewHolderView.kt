package com.example.rvworkshop.rv.vh.product

import android.content.Context
import android.util.AttributeSet
import android.view.View
import androidx.constraintlayout.widget.ConstraintLayout
import com.example.rvworkshop.R

class GridV2ViewHolderView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet?,
    defaultStyleAttr: Int = 0,
    defaultStyleRes: Int = 0
): ConstraintLayout(context, attrs, defaultStyleAttr, defaultStyleRes) {


    init {
        View.inflate(context, R.layout.product_grid2_view, this)
    }
}