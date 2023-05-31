package com.example.labka2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.labka2.databinding.ActivityMainBinding
import com.example.labka2.list.ArticleAdapter
import com.example.labka2.list.ArticleModel
import com.example.labka2.list.ListFragment

class MainActivity : AppCompatActivity() {

    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}