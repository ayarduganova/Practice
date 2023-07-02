package com.project.summer_practice

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.google.android.material.snackbar.Snackbar
import com.project.summer_practice.databinding.FragmentJustinBieberBinding
import com.project.summer_practice.databinding.FragmentMainBinding
import com.project.summer_practice.databinding.FragmentMusicBinding

class MusicFragment : Fragment(R.layout.fragment_music) {
    private var binding: FragmentMusicBinding? = null


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentMusicBinding.bind(view)

        binding?.run {
            btnToJustinBieber.setOnClickListener {
                findNavController().navigate(R.id.action_musicFragment_to_justinBieberFragment)
                val c = this.javaClass.simpleName
                JustinBieberFragment.createBundle(c)
                Snackbar.make(binding!!.root, c, Snackbar.LENGTH_LONG).show()
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}