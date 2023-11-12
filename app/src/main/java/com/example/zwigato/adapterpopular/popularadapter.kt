package com.example.zwigato.adapterpopular

import android.R
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.commit
import androidx.recyclerview.widget.RecyclerView
import com.example.zwigato.Fragment.HomeFragment
import com.example.zwigato.MainActivity
import com.example.zwigato.databinding.PopularItemBinding


class popularadapter(
    private val items: List<String>,
    private val price: List<String>,
    private val images: List<Int>
) : RecyclerView.Adapter<popularadapter.PopularViewHolder>() {


        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PopularViewHolder {
            return PopularViewHolder(
                PopularItemBinding.inflate(
                    LayoutInflater.from(parent.context),
                    parent,
                    false
                )
            )
        }

        override fun getItemCount(): Int {
            return items.size
        }

        override fun onBindViewHolder(holder: PopularViewHolder, position: Int) {

            val Items = items[position]
            val Images = images[position]
            val Prices = price[position]
            holder.bind(Items, Images, Prices)

        }

        class PopularViewHolder(private val Binding: PopularItemBinding) :
            RecyclerView.ViewHolder(Binding.root) {

            val imageview = Binding.imageView6
            fun bind(items: String, images: Int, price: String) {

                Binding.foodNamePopular.text = items
                Binding.pricepopular.text = price
                imageview.setImageResource(images)

            }

        }

    }

