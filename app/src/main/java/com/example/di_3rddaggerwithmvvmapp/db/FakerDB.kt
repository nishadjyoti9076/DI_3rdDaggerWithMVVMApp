package com.example.di_3rddaggerwithmvvmapp.db

import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.di_3rddaggerwithmvvmapp.models.Products
import okhttp3.internal.Version

@Database(entities = [Products::class], version = 1)
abstract class FakerDB : RoomDatabase() {

 abstract fun getFakerDao() : FakerDAO
}