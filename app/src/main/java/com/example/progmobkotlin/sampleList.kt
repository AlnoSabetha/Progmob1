package com.example.progmobkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class sampleList : AppCompatActivity() {

    lateinit var btnSample : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sample_list)

        btnSample = findViewById(R.id.btnShowList)

        btnSample.setOnClickListener(View.OnClickListener { View ->
           var intent = Intent(this@sampleList, sampleListView::class.java)
            startActivity(intent)
        })

    }
}