package com.example.androidtester.ui.second

import androidx.appcompat.widget.Toolbar
import androidx.navigation.NavController
import androidx.navigation.findNavController
import com.example.androidtester.base.BaseActivity
import com.example.androidtester.databinding.ActivitySecondBinding

class SecondActivity : BaseActivity<ActivitySecondBinding>(ActivitySecondBinding::inflate) {

    override val toolbar: Toolbar by lazy { binding.toolbar }
    override val navController: NavController
        get() = findNavController(binding.navHostFragment.id)
}