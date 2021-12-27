package com.example.androidtester.base.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import androidx.viewbinding.ViewBinding

abstract class CommonAdapter<T, VB : ViewBinding> :
    ListAdapter<T, CommonAdapter<T, VB>.ViewHolder>(DefaultItemDiffCallback()) {

    protected abstract val viewBindingProvider: (LayoutInflater, ViewGroup?) -> VB

    protected abstract fun bind(item: T, binding: VB)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = viewBindingProvider(LayoutInflater.from(parent.context), parent)
        return object : ViewHolder(binding) {
            override fun bind(item: T) = this@CommonAdapter.bind(item, binding)
        }
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(currentList[position])
    }

    abstract inner class ViewHolder(binding: VB) : RecyclerView.ViewHolder(binding.root) {

        abstract fun bind(item: T)
    }
}