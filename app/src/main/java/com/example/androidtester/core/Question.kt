package com.example.androidtester.core

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Question(
    val name: String,
    val answers: List<String>
) : Parcelable
