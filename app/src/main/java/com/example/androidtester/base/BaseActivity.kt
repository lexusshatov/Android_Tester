package com.example.androidtester.base

import android.os.Bundle
import android.view.MenuItem
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.navigation.NavController

abstract class BaseActivity(@LayoutRes contentLayoutId: Int) : AppCompatActivity(contentLayoutId) {

    open val toolbar: Toolbar? = null
    open val navController: NavController? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        toolbar?.let {
            setSupportActionBar(it)
            supportActionBar!!.setDisplayHomeAsUpEnabled(!isTaskRoot)
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            android.R.id.home -> finish()
        }
        return true
    }

    override fun onBackPressed() {
        if (navController?.navigateUp() == true) return
        super.onBackPressed()
    }
}