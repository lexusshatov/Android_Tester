package com.example.androidtester.ui

import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.androidtester.base.BaseActivity
import com.example.androidtester.databinding.ActivityHomeBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HomeActivity : BaseActivity<ActivityHomeBinding>(ActivityHomeBinding::inflate) {

    override val toolbar: Toolbar? by lazy { binding.toolbar }
    override val navController: NavController
        get() = findNavController(binding.navHostFragment.id)
}   