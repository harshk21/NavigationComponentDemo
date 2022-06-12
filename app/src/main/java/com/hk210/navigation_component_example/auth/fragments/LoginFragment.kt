package com.hk210.navigation_component_example.auth.fragments

import android.content.Intent
import android.os.Bundle
import android.text.TextUtils
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController
import com.hk210.navigation_component_example.dashboard.DashboardActivity
import com.hk210.navigation_component_example.databinding.LoginFragmentBinding

class LoginFragment : Fragment() {

    private lateinit var loginFragmentBinding: LoginFragmentBinding
    private lateinit var navController: NavController

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        loginFragmentBinding = LoginFragmentBinding.inflate(inflater,  container, false)
        return loginFragmentBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        navController = findNavController()

        login()
        openForgotPasswordScreen()
    }

    private fun login() {
        loginFragmentBinding.loginButton.setOnClickListener {
            when {
                TextUtils.isEmpty(loginFragmentBinding.email.text.toString().trim()) -> {
                    loginFragmentBinding.email.error = "Email Cannot be empty"
                }
                TextUtils.isEmpty(loginFragmentBinding.password.text.toString().trim()) -> {
                    loginFragmentBinding.password.error = "Password Cannot be empty"
                }
                else -> {
                    openDashboardActivity()
                }
            }
        }
    }

    private fun openForgotPasswordScreen() {
        loginFragmentBinding.forgotPasswordButton.setOnClickListener {
            val action = LoginFragmentDirections.actionLoginFragmentToForgotPasswordFragment()
            navController.navigate(action)
        }
    }

    private fun openDashboardActivity() {
        startActivity(Intent(requireActivity(), DashboardActivity::class.java))
        requireActivity().finish()
    }
}