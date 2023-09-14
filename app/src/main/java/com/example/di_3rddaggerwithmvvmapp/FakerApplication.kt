package com.example.di_3rddaggerwithmvvmapp

import android.app.Application
import com.example.di_3rddaggerwithmvvmapp.di.ApplicationComponent
import com.example.di_3rddaggerwithmvvmapp.di.DaggerApplicationComponent
import dagger.Component


class FakerApplication : Application() {
 lateinit var applicationcomponent : ApplicationComponent

    override fun onCreate() {
        super.onCreate()
        applicationcomponent=DaggerApplicationComponent.factory().create(this)
    }
}