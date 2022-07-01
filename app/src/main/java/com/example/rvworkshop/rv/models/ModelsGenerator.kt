package com.example.rvworkshop.rv.models

import kotlin.random.Random

object ModelsGenerator {

    fun generateDefaultModels(): List<BaseRvModel> {
        val result = mutableListOf<BaseRvModel>()

        for (i in 0..1000) {
            val items = when(Random.nextInt(1, 4)){
                1 -> generateProductsGrid2()
                2 -> generateProduct()
                3 -> generateText()
                else -> emptyList()
            }

            result.addAll(items)
        }

        return result
    }

    private fun generateProductsGrid2() = listOf(
        ProductGrid2Generator.generateProduct(),
        ProductGrid2Generator.generateProduct()
    )

    private fun generateProduct() = listOf(
        ProductGenerator.generateProduct()
    )

    private fun generateText(text: String = "SomeText") = listOf(
        TextRvModel(text),
    )
}