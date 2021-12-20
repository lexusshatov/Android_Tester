package com.example.androidtester.ui.settings

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.androidtester.base.BaseFragment
import com.example.androidtester.databinding.FragmentSettingsBinding

class SettingsFragment : BaseFragment<FragmentSettingsBinding>() {

    override val viewBindingProvider: (LayoutInflater, ViewGroup?) -> FragmentSettingsBinding =
        { inflater, container ->
            FragmentSettingsBinding.inflate(inflater, container, false)
        }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.back.setOnClickListener {
            findNavController().navigate(SettingsFragmentDirections.actionSettingsFragmentToSecondGraph())
        }
    }
}