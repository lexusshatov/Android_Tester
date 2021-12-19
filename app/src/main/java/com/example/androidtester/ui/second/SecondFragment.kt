package com.example.androidtester.ui.second

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.androidtester.base.BaseFragment
import com.example.androidtester.databinding.FragmentSecondBinding

class SecondFragment : BaseFragment<FragmentSecondBinding>() {

    override val viewBindingProvider: (LayoutInflater, ViewGroup?) -> FragmentSecondBinding =
        { inflater, container ->
            FragmentSecondBinding.inflate(inflater, container, false)
        }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.back.setOnClickListener {
            findNavController().navigateUp()
        }
    }
}