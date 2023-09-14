package com.example.di_3rddaggerwithmvvmapp.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.di_3rddaggerwithmvvmapp.models.Products

@Dao
interface FakerDAO {

    @Insert
   suspend fun addProducts(products: List<Products>)

   @Query("Select * from product")
   fun getproducts() : List<Products>
}