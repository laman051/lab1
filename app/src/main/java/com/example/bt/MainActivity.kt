package com.example.bt

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btncong.setOnClickListener {
           var kq: Double = (a.text.toString()).toDouble() +  b.text.toString().toDouble()
            tvtketqua.text =kq.toString()
        }
        btntru.setOnClickListener {
            var kqtru: Double = (a.text.toString()).toDouble() -  b.text.toString().toDouble()
            tvtketqua.text =kqtru.toString()
        }
        btnnhan.setOnClickListener {
            var kqnhan: Double = (a.text.toString()).toDouble() *  b.text.toString().toDouble()
            tvtketqua.text =kqnhan.toString()
        }
        btnchia.setOnClickListener {
            var kqchia: Double = (a.text.toString()).toDouble() /  b.text.toString().toDouble()
            tvtketqua.text =kqchia.toString()
        }


    }
}


