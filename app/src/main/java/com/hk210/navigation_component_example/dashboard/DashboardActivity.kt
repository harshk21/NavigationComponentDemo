package com.hk210.navigation_component_example.dashboard

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.hk210.navigation_component_example.R
import com.hk210.navigation_component_example.databinding.DashboardActivityBinding

class DashboardActivity : AppCompatActivity() {

    private lateinit var dashboardActivityBinding: DashboardActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        dashboardActivityBinding = DashboardActivityBinding.inflate(layoutInflater)
        attachBottomNavigation()
        dashboardActivityBinding.root.apply {
            setContentView(this)
        }
    }

    private fun attachBottomNavigation() {
        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.dashboard_nav_host) as NavHostFragment
        val navController = navHostFragment.navController
        dashboardActivityBinding.bottomNavigation.setupWithNavController(navController)
    }
}