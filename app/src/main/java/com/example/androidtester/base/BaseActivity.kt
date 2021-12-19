package com.example.androidtester.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.viewbinding.ViewBinding

abstract class BaseActivity<VB : ViewBinding>(
    private val viewBindingProvider: (LayoutInflater) -> VB,
) : AppCompatActivity() {

    val binding: VB by lazy { viewBindingProvider(layoutInflater) }

    open val toolbar: Toolbar? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        toolbar?.let {
            setSupportActionBar(it)
            supportActionBar!!.setDisplayHomeAsUpEnabled(!isTaskRoot)
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            android.R.id.home -> onBackPressed()
        }
        return true
    }
}