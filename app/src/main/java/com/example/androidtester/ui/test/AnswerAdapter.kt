package com.example.androidtester.ui.test

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.androidtester.base.adapter.DefaultItemDiffCallback
import com.example.androidtester.databinding.ItemAnswerBinding

class AnswerAdapter : ListAdapter<String, AnswerAdapter.ViewHolder>(DefaultItemDiffCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemAnswerBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(currentList[position])
    }


    inner class ViewHolder(private val binding: ItemAnswerBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(question: String) {
            binding.question.text = question
            binding.root.setOnClickListener {
                binding.root.isChecked = !binding.root.isChecked
            }
        }
    }
}
