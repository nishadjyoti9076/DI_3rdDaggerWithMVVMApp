package com.example.di_3rddaggerwithmvvmapp.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.di_3rddaggerwithmvvmapp.db.FakerDB
import com.example.di_3rddaggerwithmvvmapp.models.Products
import com.example.di_3rddaggerwithmvvmapp.retrofit.FakerApi
import javax.inject.Inject


class ProductSRepository @Inject constructor(private val fakerApi: FakerApi, private val fakerDB : FakerDB){

    private val _product= MutableLiveData<List<Products>>()
     val products: LiveData<List<Products>>
     get() = _product



   suspend fun getProducts() {
        val result =fakerApi.getProducts()
       if (result.isSuccessful && result.body() !=null){
           fakerDB.getFakerDao().addProducts(result.body()!!)
           _product.postValue(result.body())
       }
    }
}