package com.example.androidtester.base

import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.viewbinding.ViewBinding

abstract class BaseActivity<VB : ViewBinding> : AppCompatActivity() {

    abstract val viewBindingProvider: (LayoutInflater) -> VB
    val binding: VB by lazy { viewBindingProvider(layoutInflater) }

    open val toolbar: Toolbar? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        toolbar?.let {
            setSupportActionBar(it)
            val hasBackStack = supportFragmentManager.backStackEntryCount > 0
            supportActionBar!!.setDisplayHomeAsUpEnabled(hasBackStack)
        }
    }
}