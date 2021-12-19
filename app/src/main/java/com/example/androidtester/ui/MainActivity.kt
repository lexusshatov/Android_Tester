package com.example.androidtester.ui

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.widget.Toolbar
import com.example.androidtester.base.BaseActivity
import com.example.androidtester.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : BaseActivity<ActivityMainBinding>() {

    override val viewBindingProvider: (LayoutInflater) -> ActivityMainBinding = {
        ActivityMainBinding.inflate(it)
    }

    override val toolbar: Toolbar? by lazy { binding.toolbar }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding.button.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }
    }
}   