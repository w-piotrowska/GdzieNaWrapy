package com.example.gdzienawrapy

import android.content.res.Resources
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(R.style.AppTheme)
        setContentView(R.layout.activity_main)
    }

    fun generateLocation(view: View) {
        text2.visibility = View.VISIBLE
        val res: Resources = resources
        val loc = res.getStringArray(R.array.locations)
        text3.text = loc[(0..2).random()].toString()
        text3.visibility = View.VISIBLE
        image.visibility = View.VISIBLE
    }
}