package com.tedm.newsapp.repository

import com.tedm.newsapp.api.RetrofitInstance
import com.tedm.newsapp.db.ArticleDatabase

class NewsRepository(
    val db: ArticleDatabase
) {
    suspend fun getNews(countryCode: String, pageNumber: Int) =
        RetrofitInstance.api.getNews(countryCode,pageNumber)
}