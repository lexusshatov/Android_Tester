package com.example.androidtester.ui.test

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.androidtester.base.adapter.CommonAdapter
import com.example.androidtester.databinding.ItemAnswerBinding

class AnswerAdapter : CommonAdapter<Pair<String, Boolean>, ItemAnswerBinding>() {

    override val viewBindingProvider: (LayoutInflater, ViewGroup?) -> ItemAnswerBinding =
        { inflater, container ->
            ItemAnswerBinding.inflate(inflater, container, false)
        }

    override fun bind(item: Pair<String, Boolean>, binding: ItemAnswerBinding) {
        binding.question.text = item.first
        binding.root.isChecked = item.second
        binding.root.setOnClickListener {
            val index = currentList.indexOf(item)
            if (index == RecyclerView.NO_POSITION) return@setOnClickListener
            val resultList = currentList.toMutableList()
                .map { Pair(it.first, false) }
                .toMutableList()
                .apply { set(index, get(index).copy(second = true)) }
            submitList(resultList)
        }
    }

    fun submitAnswers(answers: List<String>) {
        val pairList = answers.map { Pair(it, false) }
        submitList(pairList)
    }
}
