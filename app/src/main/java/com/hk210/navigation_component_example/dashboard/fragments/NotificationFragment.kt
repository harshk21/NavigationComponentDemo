package com.hk210.navigation_component_example.dashboard.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.hk210.navigation_component_example.R
import com.hk210.navigation_component_example.databinding.NotificationFragmentBinding

class NotificationFragment : Fragment() {

    private lateinit var notificationFragmentBinding: NotificationFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        notificationFragmentBinding = NotificationFragmentBinding.inflate(inflater, container, false)
        return notificationFragmentBinding.root
    }
}