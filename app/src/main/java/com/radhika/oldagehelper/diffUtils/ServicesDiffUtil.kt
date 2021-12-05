package com.radhika.oldagehelper.diffUtils

import androidx.recyclerview.widget.DiffUtil
import com.radhika.oldagehelper.models.ServiceModel

class ServicesDiffUtil(
    private val oldList: List<ServiceModel>,
    private val newList: List<ServiceModel>
) : DiffUtil.Callback() {
    override fun getOldListSize(): Int {
        return oldList.size
    }

    override fun getNewListSize(): Int {
        return newList.size
    }

    override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        return oldList[oldItemPosition].id == newList[newItemPosition].id
    }

    override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        return when {
            oldList[oldItemPosition].id != newList[newItemPosition].id -> {
                false
            }
            oldList[oldItemPosition].name != newList[newItemPosition].name -> {
                false
            }
            oldList[oldItemPosition].service != newList[newItemPosition].service -> {
                false
            }
            oldList[oldItemPosition].imageUrl != newList[newItemPosition].imageUrl -> {
                false
            }
            else -> true
        }
    }
}