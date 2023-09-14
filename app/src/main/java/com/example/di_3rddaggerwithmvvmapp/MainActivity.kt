package com.example.di_3rddaggerwithmvvmapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import com.example.di_3rddaggerwithmvvmapp.db.FakerDB
import com.example.di_3rddaggerwithmvvmapp.retrofit.FakerApi
import com.example.di_3rddaggerwithmvvmapp.viewmodels.MainViewModel
import com.example.di_3rddaggerwithmvvmapp.viewmodels.MainViewModelFactory
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    lateinit var mainViewModel: MainViewModel

    @Inject
    lateinit var fakerDB1: FakerDB

    @Inject
    lateinit var fakerDB2: FakerDB

private val product : TextView
get() = findViewById(R.id.products)
    @Inject
    lateinit var mainviewmodelfactory : MainViewModelFactory
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        (application as FakerApplication).applicationcomponent.inject(this)  // this is call field injection
        mainViewModel=ViewModelProvider(this,mainviewmodelfactory).get(MainViewModel::class.java)

        mainViewModel.productlivadata.observe(this){

            product.text= it.joinToString { x -> x.title }

        }
    }
}