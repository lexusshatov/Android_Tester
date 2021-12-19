package com.example.androidtester.ui

import androidx.appcompat.widget.Toolbar
import com.example.androidtester.base.BaseActivity
import com.example.androidtester.databinding.ActivitySecondBinding

class SecondActivity : BaseActivity<ActivitySecondBinding>(ActivitySecondBinding::inflate) {

    override val toolbar: Toolbar by lazy { binding.toolbar }
}