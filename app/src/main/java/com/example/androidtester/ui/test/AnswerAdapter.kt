package com.example.androidtester.ui.test

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.androidtester.base.adapter.DefaultItemDiffCallback
import com.example.androidtester.databinding.ItemAnswerBinding

class AnswerAdapter :
    ListAdapter<Pair<String, Boolean>, AnswerAdapter.ViewHolder>(DefaultItemDiffCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemAnswerBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(currentList[position])
    }


    inner class ViewHolder(private val binding: ItemAnswerBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(question: Pair<String, Boolean>) {
            binding.question.text = question.first
            binding.root.isChecked = question.second
            binding.root.setOnClickListener {
                val index = currentList.indexOf(question)
                if (index == RecyclerView.NO_POSITION) return@setOnClickListener
                val resultList = currentList.toMutableList()
                    .map { Pair(it.first, false) }
                    .toMutableList()
                    .apply { set(index, get(index).copy(second = true)) }
                submitList(resultList)
            }
        }
    }

    fun submitAnswers(answers: List<String>) {
        val pairList = answers.map { Pair(it, false) }
        submitList(pairList)
    }
}
