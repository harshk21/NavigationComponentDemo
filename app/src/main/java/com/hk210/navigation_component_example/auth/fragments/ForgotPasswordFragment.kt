package com.hk210.navigation_component_example.auth.fragments

import android.os.Bundle
import android.text.TextUtils
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController
import com.hk210.navigation_component_example.databinding.ForgotPasswordFragmentBinding

class ForgotPasswordFragment : Fragment() {

    private lateinit var forgotPasswordFragmentBinding: ForgotPasswordFragmentBinding
    private lateinit var navController: NavController

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        forgotPasswordFragmentBinding =
            ForgotPasswordFragmentBinding.inflate(inflater, container, false)
        return forgotPasswordFragmentBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        navController = findNavController()

        onNextClicked()
    }

    private fun onNextClicked() {
        forgotPasswordFragmentBinding.nextButton.setOnClickListener {
            val email = forgotPasswordFragmentBinding.forgotPasswordEmail.text.toString().trim()
            when {
                TextUtils.isEmpty(email) -> {
                    forgotPasswordFragmentBinding.forgotPasswordEmail.error =
                        "Email Cannot be empty"
                }
                else -> {
                    openEmailSentScreen(email)
                }
            }
        }
    }

    private fun openEmailSentScreen(email: String) {
        val action =
            ForgotPasswordFragmentDirections.actionForgotPasswordFragmentToEmailSentFragment(email = email)
        navController.navigate(action)
    }
}