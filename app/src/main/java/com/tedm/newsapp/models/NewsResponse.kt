package com.tedm.newsapp.models

import com.tedm.newsapp.models.Article

data class NewsResponse(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
)