package com.example.progmobkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var tvMain : TextView
    lateinit var btnSubmit : Button
    lateinit var btnHelp : Button
    lateinit var btnProt : Button
    lateinit var edText : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvMain = findViewById(R.id.tv_main_Activity)
        tvMain.text = getString(R.string.halo_dunia)

        btnSubmit = findViewById(R.id.btn_submit)
        edText = findViewById(R.id.ed_text_main)
        btnHelp = findViewById(R.id.btn_help)
        btnProt = findViewById(R.id.btn_prot)

        btnSubmit.setOnClickListener(View.OnClickListener { View ->
            var strTmp = edText.text.toString()
            tvMain.text = strTmp
        })

        btnHelp.setOnClickListener(View.OnClickListener { View ->
            var intent = Intent(this@MainActivity, HelpActivity::class.java)
            startActivity(intent)
        })

        btnProt.setOnClickListener(View.OnClickListener { View ->
            var intent1 = Intent(this@MainActivity, TrackerActivity::class.java)
            startActivity(intent1)
        })

    }
}