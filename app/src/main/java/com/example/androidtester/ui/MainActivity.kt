package com.example.androidtester.ui

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import com.example.androidtester.base.BaseActivity
import com.example.androidtester.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : BaseActivity<ActivityMainBinding>(ActivityMainBinding::inflate) {

    override val toolbar: Toolbar? by lazy { binding.toolbar }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding.button.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }
    }
}   