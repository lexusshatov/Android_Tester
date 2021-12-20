package com.example.androidtester.ui.test

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.androidtester.base.BaseFragment
import com.example.androidtester.databinding.FragmentTestBinding

class TestFragment : BaseFragment<FragmentTestBinding>() {

    override val viewBindingProvider: (LayoutInflater, ViewGroup?) -> FragmentTestBinding =
        { inflater, container ->
            FragmentTestBinding.inflate(inflater, container, false)
        }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.back.setOnClickListener {
            findNavController().navigate(TestFragmentDirections.actionTestFragmentToSecondGraph3())
        }
    }
}