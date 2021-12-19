package com.example.androidtester.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.androidtester.base.BaseFragment
import com.example.androidtester.databinding.FragmentFirstBinding

class FirstFragment : BaseFragment<FragmentFirstBinding>() {

    override val viewBindingProvider: (LayoutInflater, ViewGroup?) -> FragmentFirstBinding =
        { inflater, container ->
            FragmentFirstBinding.inflate(inflater, container, false)
        }
}