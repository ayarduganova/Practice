package com.project.summer_practice

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.project.summer_practice.databinding.FragmentMainBinding
import com.project.summer_practice.databinding.FragmentProfileBinding

class MainFragment : Fragment(R.layout.fragment_main) {

    private var binding: FragmentMainBinding? = null


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentMainBinding.bind(view)

        binding?.run {
            btnToSettings.setOnClickListener {
                findNavController().navigate(R.id.action_mainFragment2_to_settingFragment)
            }
            btnToProfile.setOnClickListener {
                findNavController().navigate(
                    R.id.action_mainFragment2_to_profileFragment,
                    ProfileFragment.createBundle("Nastya", 28)
                )
            }
            btnToGroups.setOnClickListener {
                findNavController().navigate(R.id.action_mainFragment2_to_groupsFragment)
            }
            btnToMusic.setOnClickListener {
                findNavController().navigate(R.id.action_mainFragment2_to_musicFragment)
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}