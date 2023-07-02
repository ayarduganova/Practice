package com.project.summer_practice

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.project.summer_practice.databinding.FragmentGroupsBinding
import com.project.summer_practice.databinding.FragmentMusicBinding

class GroupsFragment : Fragment(R.layout.fragment_groups) {
    private var binding: FragmentGroupsBinding? = null


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentGroupsBinding.bind(view)

        binding?.run {
            btnToSettings.setOnClickListener {
                findNavController().navigate(R.id.action_groupsFragment_to_settingFragment)
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}