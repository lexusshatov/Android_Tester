package com.example.androidtester.ui.test

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.androidtester.R
import com.example.androidtester.databinding.FragmentTestBinding

class TestFragment : Fragment(R.layout.fragment_test) {

    private val binding by viewBinding<FragmentTestBinding>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.back.setOnClickListener {
            findNavController().navigate(TestFragmentDirections.actionTestFragmentToSecondGraph3())
        }
    }
}