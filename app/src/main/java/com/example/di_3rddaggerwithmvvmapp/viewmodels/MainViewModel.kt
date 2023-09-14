package com.example.di_3rddaggerwithmvvmapp.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.di_3rddaggerwithmvvmapp.models.Products
import com.example.di_3rddaggerwithmvvmapp.repository.ProductSRepository
import kotlinx.coroutines.launch
import javax.inject.Inject

class MainViewModel @Inject constructor(private val repository: ProductSRepository) : ViewModel(){

    val productlivadata: LiveData<List<Products>>
    get() = repository.products

    init {
        viewModelScope.launch {
            repository.getProducts()
        }
    }

}