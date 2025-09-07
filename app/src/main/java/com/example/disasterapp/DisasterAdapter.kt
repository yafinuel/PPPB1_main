package com.example.disasterapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.disasterapp.databinding.ItemDisasterBinding

typealias OnClickDisaster = (Disaster) -> Unit

class DisasterAdapter(private val listDisaster: List<Disaster>, private val onClickDisaster: OnClickDisaster):
    RecyclerView.Adapter<DisasterAdapter.ItemDisasterViewHolder>() {

    inner class ItemDisasterViewHolder(private val binding: ItemDisasterBinding):
            RecyclerView.ViewHolder(binding.root) {
        fun bind(data: Disaster) {
            with(binding){
                txtDisasterName.text = data.nameDisaster
                txtDisasterType.text = data.disasterType

                itemView.setOnClickListener {
                    onClickDisaster(data)
                }
            }
        }
    }


// membuat object viewHolder dari layout item_disaster.xml
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ItemDisasterViewHolder {
        val binding = ItemDisasterBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ItemDisasterViewHolder(binding)
    }

//    Fungsi untuk binding data dengan view
    override fun onBindViewHolder(
        holder: ItemDisasterViewHolder,
        position: Int
    ) {
        holder.bind(listDisaster[position])
    }

//    fungsi untuk mengembalikan jumlah data
    override fun getItemCount(): Int {
        return listDisaster.size
    }
}
