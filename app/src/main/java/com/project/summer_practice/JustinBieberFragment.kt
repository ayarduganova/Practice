package com.project.summer_practice

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.google.android.material.snackbar.Snackbar
import com.project.summer_practice.databinding.FragmentJustinBieberBinding
import com.project.summer_practice.databinding.FragmentProfileBinding

class JustinBieberFragment : Fragment(R.layout.fragment_justin_bieber) {
    companion object{

        private const val ARG_NAME_CLASS = "ARG_NAME_CLASS"

        fun createBundle(name: String): Bundle {
            val bundle = Bundle()
            bundle.putString(ARG_NAME_CLASS, name)
            return bundle
        }
    }
}