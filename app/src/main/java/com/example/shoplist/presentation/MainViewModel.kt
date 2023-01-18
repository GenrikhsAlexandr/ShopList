package com.example.shoplist.presentation

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.shoplist.data.ShopListRepositoryImpl
import com.example.shoplist.domain.DeleteShopItemUserCase
import com.example.shoplist.domain.EditShopItemUserCase
import com.example.shoplist.domain.GetShopListUserCase
import com.example.shoplist.domain.ShopItem

class MainViewModel : ViewModel() {

    private val repository = ShopListRepositoryImpl
    private val getShopListUserCase = GetShopListUserCase(repository)
    private val deleteShopItemUserCase = DeleteShopItemUserCase(repository)
    private val editShopItemUserCase = EditShopItemUserCase(repository)

    val shopList = getShopListUserCase.getShopList()

    fun deleteShopItem(shopItem: ShopItem) {
        deleteShopItemUserCase.deleteShopItem(shopItem)

    }

    fun changeEnabledState(shopItem: ShopItem) {
        val newItem = shopItem.copy(enabled = !shopItem.enabled)
    }
}