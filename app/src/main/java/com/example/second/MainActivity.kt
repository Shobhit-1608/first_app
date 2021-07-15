package com.example.second

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun clickHandler(view: View) {
        Toast.makeText(this,"welcome to android",Toast.LENGTH_SHORT).show()
    }
}