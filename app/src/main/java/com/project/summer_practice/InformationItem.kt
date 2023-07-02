package com.project.summer_practice

import android.content.Context
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.RequestManager
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.request.RequestOptions
import com.project.summer_practice.databinding.ItemCityBinding
import com.project.summer_practice.databinding.ItemInformationBinding

class InformationItem (
    private val binding: ItemInformationBinding,
    private val glide: RequestManager,
    ) : RecyclerView.ViewHolder(binding.root) {
        private val options: RequestOptions = RequestOptions
            .diskCacheStrategyOf(DiskCacheStrategy.NONE)

        private val context: Context
        get() = itemView.context

    fun onBind(city: City) {
            binding.run {
                tvTitle.text = city.name
                tvDesc.text = city.country
                tvId.text = city.id.toString()
                glide
                    .load(city.url)
                    //.placeholder(R.drawable.gato_1)
                    //.error(R.drawable.error)
                    .apply(options)
                    .into(ivImage)
            }
        }

}