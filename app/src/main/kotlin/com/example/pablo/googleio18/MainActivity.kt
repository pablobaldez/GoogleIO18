package com.example.pablo.googleio18

import android.os.Bundle
import android.support.v7.widget.DividerItemDecoration
import android.support.v7.widget.LinearLayoutManager
import com.example.pablo.googleio18.adapter.Adapter
import com.example.pablo.googleio18.lifecycle.LifecycleAwareActivity
import com.example.pablo.googleio18.livedata.ArchitectureActivity
import com.example.pablo.googleio18.sad.SadActivity
import com.example.pablo.googleio18.utils.BaseActivity
import com.example.pablo.googleio18.utils.doIfLocationIsAvailable
import com.example.pablo.googleio18.utils.startActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupRecyclerView()
        doIfLocationIsAvailable{}
    }

    private fun setupRecyclerView() {
        val adapter = Adapter(::onItemClicked)
        adapter.add("Sad sample")
        adapter.add("Lifecycle-Aware sample")
        adapter.add("LiveData and ViewModel")
        recyclerView.adapter = adapter
        val decoration = DividerItemDecoration(this, DividerItemDecoration.VERTICAL)
        recyclerView.addItemDecoration(decoration)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
    }

    private fun onItemClicked(pos: Int) {
        doIfLocationIsAvailable {
            when (pos) {
                0 -> startActivity<SadActivity>()
                1 -> startActivity<LifecycleAwareActivity>()
                2 -> startActivity<ArchitectureActivity>()
            }
        }
    }


}
