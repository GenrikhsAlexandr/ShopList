package com.example.shoplist.domain

data class ShopItem(
    val id: Int,
    val name: String,
    val count: Double,
    val enabled: Boolean,
)