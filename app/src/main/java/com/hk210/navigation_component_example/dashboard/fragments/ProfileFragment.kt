package com.hk210.navigation_component_example.dashboard.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.hk210.navigation_component_example.databinding.ProfileFragmentBinding

class ProfileFragment : Fragment() {

    private lateinit var profileFragmentBinding: ProfileFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        profileFragmentBinding = ProfileFragmentBinding.inflate(inflater, container, false)
        return profileFragmentBinding.root
    }
}