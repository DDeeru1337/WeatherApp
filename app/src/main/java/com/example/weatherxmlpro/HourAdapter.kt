package com.example.weatherxmlpro

import android.view.View
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.weatherxmlpro.databinding.ListItemBinding

class HourAdapter : ListAdapter<DayItem, > {

    class Holder(view: View) : RecyclerView.ViewHolder(view){
        val binding = ListItemBinding.bind(view)

        fun bind(item: DayItem) = with(binding){
            tvTime.text = item.hours
            tvCurrentTemp.text = item.temp
        }
    }
}