package com.example.pl_mvvmnewsapp.ui.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.pl_mvvmnewsapp.R
import com.example.pl_mvvmnewsapp.ui.NewsActivity
import com.example.pl_mvvmnewsapp.ui.NewsViewModel

class BreakingNewsFragment : Fragment(R.layout.fragment_breaking_news) {

    lateinit var viewModel: NewsViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = (activity as NewsActivity).viewModel
    }

}