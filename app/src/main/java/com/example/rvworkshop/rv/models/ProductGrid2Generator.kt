package com.example.rvworkshop.rv.models

import com.example.rvworkshop.R
import kotlin.random.Random

object ProductGrid2Generator {

    private val images = listOf(
        R.mipmap.ic_chocolate,
        R.mipmap.ic_fish,
        R.mipmap.ic_icecream,
        R.mipmap.ic_kolbasa,
        R.mipmap.ic_kolbasa2,
        R.mipmap.ic_fish,
    )

    fun generateProduct(): ProductGrid2Model{
        return ProductGrid2Model(
            images = generateImages(),
            properties = generateProperties()
        )
    }

    private fun generateImages(): List<Int> {
        return IntArray(ModelConstants.IMAGES_COUNT).map {
            images[Random.nextInt(0, 5)]
        }
    }

    private fun generateProperties(): List<String> {
        val properties = mutableListOf<String>()

        for(i in 1 .. Random.nextInt(2, 8)) {
            properties.add("property $i")
        }

        return properties
    }
}