package com.project.summer_practice

import android.content.Context.MODE_PRIVATE
import android.content.SharedPreferences
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import com.bumptech.glide.Glide
import com.project.summer_practice.databinding.FragmentCityBinding
import com.project.summer_practice.utils.showSnackbar

class InformationFragment : Fragment(R.layout.fragment_city) {
    private var binding: FragmentCityBinding? = null
    private var adapter: CityAdapter? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentCityBinding.bind(view)
        initAdapter()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }

    private fun initAdapter() {
        adapter = CityAdapter(
            list = CityRepository.list,
            glide = Glide.with(this),
            onItemClick = { city ->
                findNavController().navigate(R.id.action_informationFragment_to_informationAboutCityFragment,
                InformationAboutCityFragment.createBundle(city.id))
            }
        )
        binding?.rvCity?.adapter = adapter
        binding?.rvCity?.layoutManager = GridLayoutManager(requireContext(), 2)
    }

}