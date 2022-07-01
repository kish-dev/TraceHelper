package com.example.rvworkshop.rv.models

import com.example.rvworkshop.R

class TextRvModel(
    val text: String
): BaseRvModel() {
    override val viewType: Int = R.layout.text_view_holder
    override val spanSize: Int = 6
}