package com.example.di_3rddaggerwithmvvmapp.di

import android.content.Context
import androidx.room.Room
import com.example.di_3rddaggerwithmvvmapp.db.FakerDB
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class DatabaseModule  {

    @Singleton
    @Provides
    fun ProvideFakerDB(context : Context) : FakerDB{
       return Room.databaseBuilder(context, FakerDB::class.java,"fakerdb").build()
    }

}