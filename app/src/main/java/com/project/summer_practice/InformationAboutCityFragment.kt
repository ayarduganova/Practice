package com.project.summer_practice

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.project.summer_practice.databinding.FragmentCityBinding

class InformationAboutCityFragment : Fragment(R.layout.fragment_information_about_city) {
    private var binding: FragmentCityBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentCityBinding.bind(view)
        requireContext().getSharedPreferences("Default", Context.MODE_PRIVATE)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}