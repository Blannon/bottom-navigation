@file:Suppress("DEPRECATION")

package com.example.shoppinglist.Ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProviders
import com.example.shoppinglist.R
import com.example.shoppinglist.Ui.ShoppingList.ShoppingViewModelFactory
import com.example.shoppinglist.Ui.ShoppingList.ShoppingViewmodel
import com.example.shoppinglist.data.Repository.ShoppingRepository
import com.example.shoppinglist.data.db.ShoppingDatabase as DbShoppingDatabase

class ShoppingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shopping)

        val database= DbShoppingDatabase
        val Repostory=ShoppingRepository(database)
        val Factory= ShoppingViewModelFactory(Repostory)
        val viewmodel= ViewModelProviders.of(this, Factory).get(ShoppingViewmodel::class.java)
    }
}