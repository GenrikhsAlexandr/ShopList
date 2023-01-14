package com.example.shoplist.domain

class GetShopUserCase(private val shopListRepository: ShopListRepository) {

    fun getShopList(): List<ShopItem> {
       return shopListRepository.getShopList()
    }
}