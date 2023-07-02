package com.project.summer_practice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.core.widget.addTextChangedListener
import com.project.summer_practice.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val newBinding = ActivityMainBinding.inflate(layoutInflater)
        binding = newBinding
        setContentView(newBinding.root)

        binding.etLogin.addTextChangedListener {
            Log.e("etLogin", "Message: ${it?.toString()}")
            binding.tiLogin.error = null
        }
        binding.tiLogin.error = "ERROR"
    }


}