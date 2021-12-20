package com.example.androidtester.ui.home

import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.example.androidtester.base.BaseActivity
import com.example.androidtester.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : BaseActivity<ActivityMainBinding>(ActivityMainBinding::inflate) {

    override val toolbar: Toolbar? by lazy { binding.toolbar }
    override val navController: NavController
        get() = (supportFragmentManager.findFragmentById(binding.navHostFragment.id) as NavHostFragment).navController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding.bottomNavigation.setupWithNavController(navController)
    }
}   