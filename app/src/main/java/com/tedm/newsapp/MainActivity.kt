package com.tedm.newsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tedm.newsapp.ui.NewsViewModel

class MainActivity : AppCompatActivity() {

    lateinit var viewModel: NewsViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}