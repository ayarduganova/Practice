package com.project.summer_practice

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.bumptech.glide.RequestManager
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.request.RequestOptions
import com.project.summer_practice.databinding.FragmentCityBinding
import com.project.summer_practice.databinding.FragmentInformationAboutCityBinding

class InformationAboutCityFragment : Fragment(R.layout.fragment_information_about_city) {
    private var binding: FragmentInformationAboutCityBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentInformationAboutCityBinding.bind(view)
        val id = arguments?.getInt(ID)
        var city: City? = null
        val list = CityRepository.list
        list.forEach{
            if(it.id == id){
                city = it
            }
        }
        val glide = Glide.with(this)
        binding?.run {
            textView2.text = city?.name
            textView3.text = city?.country
            textView.text = city?.id.toString()
            glide
                .load(city?.url)
                //.placeholder(R.drawable.gato_1)
                //.error(R.drawable.error)
                .into(ivImage)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
    companion object {
        private const val ID = "ID"
        fun createBundle(id: Int): Bundle {
            val bundle = Bundle()
            bundle.putInt(ID, id)
            return bundle
        }
    }
}