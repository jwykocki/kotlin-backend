package com.jw.backend.model

data class Product(
    val id: Long,
    val name: String,
    val price: Double,
    val description: String? = null
)