package com.example.zwigato.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Adapter
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.zwigato.R
import com.example.zwigato.adapterpopular.CartAdapter
import com.example.zwigato.databinding.CartitemBinding
import com.example.zwigato.databinding.FragmentCartBinding

class CartFragment : Fragment() {
    private lateinit var binding: FragmentCartBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentCartBinding.inflate(inflater, container, false)

        val cartFoodName = listOf("NonVegBiryani", "Pancake", "Momos", "Veg Biryani")
        val cartItemPrice = listOf("$10", "$8", "$7", "$9")
        val cartItemImage =
            listOf(R.drawable.menu1, R.drawable.menu2, R.drawable.menu3, R.drawable.menu4)

        val adapter = CartAdapter(ArrayList(cartFoodName), ArrayList(cartItemPrice),
            ArrayList(cartItemImage))
        binding.cartRecyclerView.layoutManager = LinearLayoutManager(requireContext())
        binding.cartRecyclerView.adapter = adapter

        return binding.root
    }
}