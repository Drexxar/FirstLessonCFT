package com.example.firstlessoncft

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.firstlessoncft.Fragments.FirstFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager
            .beginTransaction()
            .add(R.id.fragmentContainer, FirstFragment())
            .addToBackStack("FirstFragment")
            .commit()
    }
}