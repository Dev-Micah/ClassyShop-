package com.micahnyabuto.domain.model

data class Product(
    val id: Int,
    val name: String,
    val price: Double,
    val description: String,
    val imageUrl: String
){
    val priceString: String
        get() = "$$price"
}
