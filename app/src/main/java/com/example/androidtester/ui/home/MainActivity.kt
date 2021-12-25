package com.example.androidtester.ui.home

import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.androidtester.R
import com.example.androidtester.base.BaseActivity
import com.example.androidtester.databinding.ActivityMainBinding
import com.example.androidtester.utils.setNavController
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : BaseActivity(R.layout.activity_main) {

    private val binding by viewBinding<ActivityMainBinding>()

    override val toolbar: Toolbar by lazy { binding.toolbar }
    override val navController: NavController
        get() = (supportFragmentManager.findFragmentById(binding.navHostFragment.id) as NavHostFragment).navController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding.bottomNavigation.setNavController(navController)
    }

}   