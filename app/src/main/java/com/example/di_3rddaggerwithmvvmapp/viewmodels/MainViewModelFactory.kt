package com.example.di_3rddaggerwithmvvmapp.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.di_3rddaggerwithmvvmapp.repository.ProductSRepository
import javax.inject.Inject

class MainViewModelFactory @Inject constructor( private val mainViewModel: MainViewModel): ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return mainViewModel as T
    }
}