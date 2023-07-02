package com.project.summer_practice

import android.content.Context
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.bumptech.glide.Glide
import com.bumptech.glide.RequestManager
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.request.RequestOptions
import com.project.summer_practice.databinding.ItemCityBinding


class CityItem(
    private val binding: ItemCityBinding,
    private val glide: RequestManager,
    private val onItemClick: (City) -> Unit,
) : ViewHolder(binding.root) {

    private val options: RequestOptions = RequestOptions
        .diskCacheStrategyOf(DiskCacheStrategy.NONE)

    private val context: Context
        get() = itemView.context

    fun onBind(city: City) {
        binding.run {
            tvTitle.text = city.name
            tvDesc.text = city.country
                glide
                .load(city.url)
                //.placeholder(R.drawable.gato_1)
                //.error(R.drawable.error)
                .apply(options)
                .into(ivImage)
            root.setOnClickListener {
                onItemClick(city)
            }
        }
    }

}