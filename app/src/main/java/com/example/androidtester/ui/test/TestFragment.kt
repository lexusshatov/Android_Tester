package com.example.androidtester.ui.test

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.androidtester.R
import com.example.androidtester.databinding.FragmentTestBinding

class TestFragment : Fragment(R.layout.fragment_test) {

    private val binding by viewBinding<FragmentTestBinding>()
    private val adapter: QuestionPagerAdapter by lazy {
        QuestionPagerAdapter(this, TestQuestions.questions)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.questionPager.adapter = adapter
    }
}