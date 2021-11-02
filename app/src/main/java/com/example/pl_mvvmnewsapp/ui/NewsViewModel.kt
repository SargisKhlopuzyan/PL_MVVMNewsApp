package com.example.pl_mvvmnewsapp.ui

import androidx.lifecycle.ViewModel
import com.example.pl_mvvmnewsapp.repository.NewsRepository

class NewsViewModel(
    val newsRepository: NewsRepository
) : ViewModel() {
}