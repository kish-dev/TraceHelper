package com.example.rvworkshop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.rvworkshop.rv.SampleAdapter
import com.example.rvworkshop.rv.models.ModelsGenerator
import com.example.rvworkshop.rv.vh.BaseViewHolder
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val adapter = SampleAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val lm = GridLayoutManager(this, 6)
        lm.spanSizeLookup = object : GridLayoutManager.SpanSizeLookup() {
            override fun getSpanSize(position: Int): Int {
                return adapter.items.getOrNull(position)?.spanSize ?: -1
             }
        }

        rv.layoutManager = lm
        rv.adapter = adapter

        adapter.submitList(ModelsGenerator.generateDefaultModels())

        button.setOnClickListener {
            adapter.submitList(ModelsGenerator.generateDefaultModels())
        }
    }
}