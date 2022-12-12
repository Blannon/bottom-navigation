package com.example.shoppinglist.Ui.ShoppingList

import androidx.lifecycle.ViewModel
import com.example.shoppinglist.data.Repository.ShoppingRepository
import com.example.shoppinglist.data.db.Entities.ShoppingItem
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.launch

class ShoppingViewmodel(
    private val Repostory:ShoppingRepository
):ViewModel() {

    fun upsert(item: ShoppingItem)= CoroutineScope(Dispatchers.Main).launch{
        Repostory.upsert(item)
    }

    fun delete(item: ShoppingItem)=CoroutineScope(Dispatchers.Main).launch {
        Repostory.delete(item)
    }

    fun getAllShoppingItems() =Repostory.getAllShoppingItems()
}