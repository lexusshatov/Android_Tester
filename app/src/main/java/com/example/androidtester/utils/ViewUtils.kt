package com.example.androidtester.utils

import android.os.Handler
import android.view.View
import com.google.android.material.snackbar.Snackbar

private var snackbar: Snackbar? = null

fun View.showSnackbar(message: String) {
    Handler(context.mainLooper).post {
        snackbar = Snackbar.make(this, message, Snackbar.LENGTH_SHORT)
        snackbar!!.show()
    }
}

fun View.showNotImplementedSnackbar() {
    showSnackbar("Not implemented yet")
}