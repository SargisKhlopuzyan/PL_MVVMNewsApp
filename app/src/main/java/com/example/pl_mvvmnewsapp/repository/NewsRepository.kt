package com.example.pl_mvvmnewsapp.repository

import com.example.pl_mvvmnewsapp.api.RetrofitInstance
import com.example.pl_mvvmnewsapp.db.ArticleDatabase

class NewsRepository(
    val db: ArticleDatabase
) {

    suspend fun getBreakingNews(countryCode: String, pageNumber: Int) =
        RetrofitInstance.api.getBreakingNews(countryCode, pageNumber)

    suspend fun searchNews(searchQuery: String, pageNumber: Int) =
        RetrofitInstance.api.searchForNews(searchQuery, pageNumber)

}