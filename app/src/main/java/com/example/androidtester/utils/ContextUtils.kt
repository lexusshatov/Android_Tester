package com.example.androidtester.utils

import android.content.Context
import android.os.Handler
import android.widget.Toast

private var toast: Toast? = null

fun Context.showToast(message: String) {
    Handler(mainLooper).post {
        toast?.cancel()
        toast = Toast.makeText(this, message, Toast.LENGTH_LONG)
        toast!!.show()
    }
}

fun Context.showNotImplementedToast() {
    showToast("Not implemented yet")
}