package com.example.androidtester.ui.second

import androidx.appcompat.widget.Toolbar
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.androidtester.R
import com.example.androidtester.base.BaseActivity
import com.example.androidtester.databinding.ActivitySecondBinding

class SecondActivity : BaseActivity(R.layout.activity_second) {

    override val toolbar: Toolbar by lazy { binding.toolbar }
    private val binding by viewBinding<ActivitySecondBinding>()
}