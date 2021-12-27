package com.example.androidtester.ui.test

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.androidtester.core.Question

class QuestionPagerAdapter(
    fragment: TestFragment,
    private val questions: List<Question>,
) : FragmentStateAdapter(fragment) {

    override fun getItemCount(): Int = questions.size

    override fun createFragment(position: Int): Fragment {
        return QuestionFragment.newInstance(questions[position])
    }
}