package com.example.rvworkshop.rv.models

import com.example.rvworkshop.R
import kotlin.random.Random

object ProductGenerator {

    private val images = listOf(
        R.mipmap.ic_chocolate,
        R.mipmap.ic_fish,
        R.mipmap.ic_icecream,
        R.mipmap.ic_kolbasa,
        R.mipmap.ic_kolbasa2,
        R.mipmap.ic_fish,
    )

    fun generateProduct(): ProductModel{
        val price = Random.nextInt(0, 999999).toString()

        return ProductModel(
            images = generateImages(),
            price = price,
            title = "Product with price $price",
            description = "Description with price $price"
        )
    }

    private fun generateImages(): List<Int> {
        return IntArray(ModelConstants.IMAGES_COUNT).map {
            images[Random.nextInt(0, 5)]
        }
    }
}