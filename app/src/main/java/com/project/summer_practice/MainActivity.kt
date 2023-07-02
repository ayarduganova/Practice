package com.project.summer_practice

import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContentProviderCompat.requireContext
import androidx.recyclerview.widget.GridLayoutManager
import com.bumptech.glide.Glide
import com.google.android.material.snackbar.Snackbar
import com.project.summer_practice.CityRepository.list
import com.project.summer_practice.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var count = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val newBinding = ActivityMainBinding.inflate(layoutInflater)
        binding = newBinding
        setContentView(newBinding.root)

        val pref = getSharedPreferences("Default", MODE_PRIVATE)
        pref.getInt(ARG_COUNT, -1).takeIf { it > -1 }?.let {
            count = it
        }

        if (savedInstanceState != null) {
            count = savedInstanceState.getInt("ARG_COUNT")
        }

    }
    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt("ARG_COUNT", count)
    }

    companion object {
        private const val ARG_COUNT = "ARG_COUNT"
    }
}