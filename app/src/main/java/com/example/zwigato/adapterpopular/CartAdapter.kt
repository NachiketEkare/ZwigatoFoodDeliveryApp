package com.example.zwigato.adapterpopular

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Adapter
import androidx.recyclerview.widget.RecyclerView
import com.example.zwigato.databinding.CartitemBinding

class CartAdapter(
    private val foodItems: MutableList<String>,
    private val ItemPrice: MutableList<String>,
    private val Images: MutableList<Int>
) : RecyclerView.Adapter<CartAdapter.cartViewHolder>() {

    private var ItemQuantities = IntArray(foodItems.size){0}

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): cartViewHolder {
        val binding = CartitemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return cartViewHolder(binding)
    }

    override fun getItemCount(): Int = foodItems.size

    override fun onBindViewHolder(holder: cartViewHolder, position: Int) {
        holder.bind(position)
    }
    inner class cartViewHolder(private val binding: CartitemBinding):RecyclerView.ViewHolder(binding.root) {
        fun bind(position: Int) {
            binding.apply {
                CartFoodItem.text = foodItems[position]
                CartPriceItem.text = ItemPrice[position]
                ItemImage.setImageResource(Images[position])

                minusBtn.setOnClickListener {
                    decreaseQuantity(position)
                }
                PlusBtn.setOnClickListener {
                    Log.d("trigger","quantity")
                    increaseQuantity(position)
                }
                deleteBtn.setOnClickListener {
                    deleteItem(position)
                }

            }


        }
        private fun increaseQuantity(position: Int){
            if(ItemQuantities[position]<10){
                ItemQuantities[position]++
                binding.CartItemQuantity.text = ItemQuantities[position].toString()
            }
        }
        private fun decreaseQuantity(position: Int){
            if(ItemQuantities[position]>0){
                ItemQuantities[position]--
                binding.CartItemQuantity.text = ItemQuantities[position].toString()
            }
        }
        private fun deleteItem(position: Int){

            if (adapterPosition != RecyclerView.NO_POSITION){
                foodItems.removeAt(position)
                notifyItemRemoved(position)
                notifyItemRangeChanged(position,foodItems.size)
            }


        }

    }

}