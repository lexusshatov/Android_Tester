package com.example.androidtester.ui.home

import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import androidx.lifecycle.lifecycleScope
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.androidtester.R
import com.example.androidtester.base.BaseActivity
import com.example.androidtester.databinding.ActivityMainBinding
import com.example.androidtester.utils.setNavController
import com.example.androidtester.utils.showSnackbar
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@AndroidEntryPoint
class MainActivity : BaseActivity(R.layout.activity_main) {

    private val binding by viewBinding<ActivityMainBinding>()
    private var exitClicked: Boolean = false

    override val toolbar: Toolbar by lazy { binding.toolbar }
    override val navController: NavController
        get() = (supportFragmentManager.findFragmentById(binding.navHostFragment.id) as NavHostFragment).navController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding.bottomNavigation.setNavController(navController, true)
    }

    override fun onBackPressed() {
        if (navController.navigateUp()) return
        if (exitClicked) {
            super.onBackPressed()
        } else {
            exitClicked = true
            lifecycleScope.launch(Dispatchers.IO) {
                delay(DOUBLE_CLICK_EXIT_TIME_MS)
                exitClicked = false
            }
            binding.root.showSnackbar(getString(R.string.click_again_to_leave))
        }
    }

    private companion object {
        const val DOUBLE_CLICK_EXIT_TIME_MS = 2000L
    }
}   