package com.example.androidtester.utils

import android.os.Bundle
import androidx.core.view.forEach
import androidx.navigation.NavController
import androidx.navigation.NavDestination
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.ui.NavigationUI
import com.google.android.material.bottomnavigation.BottomNavigationView
import java.lang.ref.WeakReference

fun BottomNavigationView.setNavController(
    navController: NavController,
    clearBackstackOnReselected: Boolean = false,
) {
    setOnItemSelectedListener { item ->
        NavigationUI.onNavDestinationSelected(
            item,
            navController
        )
        true
    }
    val weakReference = WeakReference(this)
    navController.addOnDestinationChangedListener(
        object : NavController.OnDestinationChangedListener {
            override fun onDestinationChanged(
                controller: NavController,
                destination: NavDestination,
                arguments: Bundle?,
            ) {
                val view = weakReference.get()
                if (view == null) {
                    navController.removeOnDestinationChangedListener(this)
                    return
                }
                view.menu.forEach { item ->
                    if (destination.hierarchy.any { it.id == item.itemId }) {
                        item.isChecked = true
                    }
                }
            }
        })
    if (clearBackstackOnReselected) setOnItemReselectedListener { item ->
        val reselectedDestinationId = item.itemId
        navController.popBackStack(reselectedDestinationId, inclusive = false)
    }
}