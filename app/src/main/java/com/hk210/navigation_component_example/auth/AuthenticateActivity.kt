package com.hk210.navigation_component_example.auth

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.hk210.navigation_component_example.databinding.AuthenticateActivityBinding

class AuthenticateActivity : AppCompatActivity() {

    private lateinit var authenticateActivityBinding: AuthenticateActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        authenticateActivityBinding = AuthenticateActivityBinding.inflate(layoutInflater)
        authenticateActivityBinding.root.apply {
            setContentView(this)
        }
    }
}