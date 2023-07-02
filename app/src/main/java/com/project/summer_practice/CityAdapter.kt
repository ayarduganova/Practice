package com.project.summer_practice

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.RequestManager
import com.project.summer_practice.databinding.ItemCityBinding

class CityAdapter(
    private var list: List<City>,
    private val glide: RequestManager,
    private val onItemClick: (City) -> Unit,
) : RecyclerView.Adapter<CityItem>(){
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): CityItem {
        return CityItem(
            binding = ItemCityBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            ),
            glide = glide,
            onItemClick = onItemClick,
        )
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: CityItem, position: Int) {
        holder.onBind(list[position])
    }
}