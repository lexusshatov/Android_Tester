package com.example.androidtester.ui.test

import android.os.Bundle
import android.view.View
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.androidtester.R
import com.example.androidtester.base.adapter.MarginDecorator
import com.example.androidtester.core.Question
import com.example.androidtester.databinding.QuestionBlockBinding
import com.example.androidtester.utils.dp

class QuestionFragment : Fragment(R.layout.question_block) {

    private val binding by viewBinding<QuestionBlockBinding>()
    private val adapter: AnswerAdapter = AnswerAdapter()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val question = requireArguments().getParcelable<Question>(EXTRA_QUESTION)!!

        binding.question.text = question.name

        binding.recyclerAnswers.adapter = adapter
        val marginDecorator = MarginDecorator(vertical = 8.dp, horizontal = 16.dp)
        binding.recyclerAnswers.addItemDecoration(marginDecorator)
        adapter.submitAnswers(question.answers)
    }

    companion object {
        private const val EXTRA_QUESTION = "question"

        fun newInstance(question: Question) = QuestionFragment().apply {
            arguments = bundleOf(EXTRA_QUESTION to question)
        }
    }
}