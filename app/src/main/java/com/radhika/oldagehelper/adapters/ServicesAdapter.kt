package com.radhika.oldagehelper.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.radhika.oldagehelper.databinding.ItemServicesBinding
import com.radhika.oldagehelper.diffUtils.ServicesDiffUtil
import com.radhika.oldagehelper.models.ServiceModel

class ServicesAdapter : RecyclerView.Adapter<ServicesAdapter.ServicesViewHolder>() {
    private var oldList = emptyList<ServiceModel>()

    class ServicesViewHolder(val binding: ItemServicesBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ServicesViewHolder {
        return ServicesViewHolder(
            ItemServicesBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ServicesViewHolder, position: Int) {
        holder.binding.title.text = oldList[position].name
        holder.binding.service.text = oldList[position].service
        holder.binding.photo.load(oldList[position].imageUrl)
    }

    override fun getItemCount(): Int {
        return oldList.size
    }

    fun setData(newList: List<ServiceModel>) {
        val diff = ServicesDiffUtil(oldList, newList)
        val result = DiffUtil.calculateDiff(diff)
        oldList = newList
        result.dispatchUpdatesTo(this)
    }
}