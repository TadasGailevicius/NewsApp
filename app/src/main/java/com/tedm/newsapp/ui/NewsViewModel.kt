package com.tedm.newsapp.ui

import androidx.lifecycle.ViewModel
import com.tedm.newsapp.repository.NewsRepository

class NewsViewModel(
    val newsRepository: NewsRepository

) : ViewModel(){

}