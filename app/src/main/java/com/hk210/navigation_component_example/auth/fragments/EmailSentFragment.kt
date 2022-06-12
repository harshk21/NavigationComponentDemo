package com.hk210.navigation_component_example.auth.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.hk210.navigation_component_example.R
import com.hk210.navigation_component_example.databinding.EmailSentFragmentBinding

class EmailSentFragment : Fragment() {

    private lateinit var emailSentFragmentBinding: EmailSentFragmentBinding
    private val args: EmailSentFragmentArgs by navArgs()
    private lateinit var navController: NavController

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        emailSentFragmentBinding = EmailSentFragmentBinding.inflate(inflater, container, false)
        return emailSentFragmentBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        navController = findNavController()

        if(args.email.isNotEmpty()) {
            setEmail()
        }

        backToLoginClicked()
    }

    private fun setEmail() {
        emailSentFragmentBinding.emailSent.text = getString(R.string.please_check_your_email, args.email)
    }

    private fun backToLoginClicked() {
        emailSentFragmentBinding.backLoginButton.setOnClickListener {
            val action = EmailSentFragmentDirections.actionEmailSentFragmentToLoginFragment()
            navController.navigate(action)
        }
    }
}