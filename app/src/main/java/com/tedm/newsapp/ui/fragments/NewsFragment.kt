package com.tedm.newsapp.ui.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.tedm.newsapp.MainActivity
import com.tedm.newsapp.R
import com.tedm.newsapp.ui.NewsViewModel

class NewsFragment : Fragment(R.layout.activity_main) {

    lateinit var viewModel: NewsViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = (activity as MainActivity).viewModel
    }
}