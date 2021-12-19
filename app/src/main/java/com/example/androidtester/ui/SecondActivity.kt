package com.example.androidtester.ui

import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import androidx.navigation.NavController
import androidx.navigation.findNavController
import com.example.androidtester.base.BaseActivity
import com.example.androidtester.databinding.ActivitySecondBinding
import com.example.androidtester.utils.showNotImplementedToast

class SecondActivity : BaseActivity<ActivitySecondBinding>(ActivitySecondBinding::inflate) {

    override val toolbar: Toolbar by lazy { binding.toolbar }
    override val navController: NavController
        get() = findNavController(binding.navHostFragment.id)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
}