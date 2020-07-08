package com.ket.bt2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        toolbar2.title = "English Vocabulary"
        navbutton.setOnClickListener() {
            val intent: Intent = Intent(getApplicationContext(), MainActivity::class.java)
            startActivity(intent)
        }
    }
}