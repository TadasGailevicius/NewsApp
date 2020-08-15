package com.tedm.newsapp.ui.fragments

import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.bumptech.glide.Glide
import com.tedm.newsapp.MainActivity
import com.tedm.newsapp.R
import com.tedm.newsapp.ui.NewsViewModel
import kotlinx.android.synthetic.main.fragment_article.*
import kotlinx.android.synthetic.main.fragment_article_nested_scrollview.*
import kotlinx.android.synthetic.main.item_article.view.*

class ArticleFragment : Fragment(R.layout.fragment_article) {

    lateinit var viewModel: NewsViewModel
    val args: ArticleFragmentArgs by navArgs()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = (activity as MainActivity).viewModel
        collapsingToolbar.setTitle("OnBoardAppMVP")
        collapsingToolbar.setCollapsedTitleTextColor(Color.WHITE)
        val article = args.article

        Glide.with(this).load(article.urlToImage).into(fragment_article_image)
        fragment_article_title.text = article.title
        fragment_article_description.text = article.description
        fragment_article_author.text = article.author
        fragment_article_date.text = article.publishedAt

    }
}