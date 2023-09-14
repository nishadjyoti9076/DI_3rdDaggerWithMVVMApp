package com.example.di_3rddaggerwithmvvmapp.retrofit

import com.example.di_3rddaggerwithmvvmapp.models.Products
import retrofit2.Response
import retrofit2.http.GET

interface FakerApi {

    @GET("products")
   suspend fun getProducts() : Response<List<Products>>
}