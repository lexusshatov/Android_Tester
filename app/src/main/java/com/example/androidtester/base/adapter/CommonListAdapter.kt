package com.example.androidtester.base.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import androidx.viewbinding.ViewBinding

abstract class CommonListAdapter<T, VB : ViewBinding> :
    ListAdapter<T, CommonListAdapter<T, VB>.ViewHolder>(DefaultItemDiffCallback()) {

    abstract val viewBindingProvider: (LayoutInflater, ViewGroup?) -> VB

    abstract fun bind(item: T, binding: VB)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = viewBindingProvider(LayoutInflater.from(parent.context), parent)
        return object : ViewHolder(binding) {
            override fun bind(item: T) = this@CommonListAdapter.bind(item, binding)
        }
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(currentList[position])
    }

    abstract inner class ViewHolder(binding: VB) : RecyclerView.ViewHolder(binding.root) {

        abstract fun bind(item: T)
    }
}