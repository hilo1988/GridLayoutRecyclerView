package com.hiloislay.gridlayoutrecyclerview

import android.arch.lifecycle.ViewModel
import android.content.Context
import android.databinding.DataBindingUtil
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.hiloislay.gridlayoutrecyclerview.databinding.AdapterTextBinding

class MyAdapter(val context: Context, val words: List<String>) : RecyclerView.Adapter<MyAdapter.ViewHolder>() {


    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ViewHolder {
        val inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        return ViewHolder(DataBindingUtil.inflate(inflater, R.layout.adapter_text, null, false))
    }

    override fun getItemCount(): Int {
        return words.size
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
        viewHolder.binding.viewModel = AdapterViewModel("#${words[position]}")
        viewHolder.binding.executePendingBindings()
    }

    class ViewHolder(val binding: AdapterTextBinding) : RecyclerView.ViewHolder(binding.root)


    class AdapterViewModel(val text: String) : ViewModel()


}