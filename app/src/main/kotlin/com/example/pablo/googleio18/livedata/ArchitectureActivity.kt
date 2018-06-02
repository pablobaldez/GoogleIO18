package com.example.pablo.googleio18.livedata

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.content.Context
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.DividerItemDecoration
import android.support.v7.widget.LinearLayoutManager
import android.view.View

import com.example.pablo.googleio18.R
import com.example.pablo.googleio18.adapter.Adapter
import kotlinx.android.synthetic.main.activity_main.*

class ArchitectureActivity : AppCompatActivity() {

    private lateinit var adapter: Adapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        adapter = Adapter {}
        setupRecyclerView()
        val viewModel = ViewModelProviders.of(this)[SampleViewModel::class.java]
        progressBar.visibility = View.VISIBLE
        viewModel.getData().observe(this, Observer {
            progressBar.visibility = View.GONE
            adapter.setAndNotify(it!!)
        })
    }

    private fun setupRecyclerView() {
        val decoration = DividerItemDecoration(this, DividerItemDecoration.VERTICAL)
        recyclerView.addItemDecoration(decoration)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter
    }

}