package com.example.androidtester.ui.test

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.androidtester.R
import com.example.androidtester.base.adapter.MarginDecorator
import com.example.androidtester.databinding.FragmentTestBinding
import com.example.androidtester.utils.dp

class TestFragment : Fragment(R.layout.fragment_test) {

    private val binding by viewBinding<FragmentTestBinding>()
    private val adapter: AnswerAdapter = AnswerAdapter()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.layout.recyclerAnswers.adapter = adapter
        val marginDecorator = MarginDecorator(vertical = 8.dp, horizontal = 16.dp)
        binding.layout.recyclerAnswers.addItemDecoration(marginDecorator)

        val answers = listOf(
            "RecyclerView переиспользует ViewHolder'ы",
            "ListView более оптимизированный, чем RecyclerView",
            "Это один и тот же компонент под разными названиями",
            "RecyclerView - устаревший компонент, вместо него лучше использовать ListView"
        )
        adapter.submitList(answers)
    }
}