package com.example.shoppinglist.data.Repository

import com.example.shoppinglist.data.db.Entities.ShoppingItem
import com.example.shoppinglist.data.db.ShoppingDatabase

class ShoppingRepository(
    private val db: ShoppingDatabase.Companion
) {
    suspend fun upsert(item: ShoppingItem)= db.getShoppingDao().upsert(item)

    suspend fun delete(item: ShoppingItem)= db.getShoppingDao().delete(item)

    fun getAllShoppingItems()=db.getShoppingDao().getAllShoppingItems()
}