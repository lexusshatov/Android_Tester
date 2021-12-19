package com.example.androidtester.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.androidtester.base.BaseFragment
import com.example.androidtester.databinding.FragmentLoginBinding

class LoginFragment : BaseFragment<FragmentLoginBinding>() {

    override val viewBindingProvider: (LayoutInflater, ViewGroup?) -> FragmentLoginBinding =
        { inflater, container ->
            FragmentLoginBinding.inflate(inflater, container, false)
        }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.button.setOnClickListener {
            findNavController().navigate(LoginFragmentDirections.actionLoginFragmentToSecondActivity())
        }
    }
}