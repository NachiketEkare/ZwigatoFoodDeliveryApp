package com.example.zwigato.Fragment

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.denzcoskun.imageslider.constants.ScaleTypes
import com.denzcoskun.imageslider.models.SlideModel
import com.example.zwigato.R
import com.example.zwigato.adapterpopular.popularadapter
import com.example.zwigato.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {

    private lateinit var Binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        Binding = FragmentHomeBinding.inflate(layoutInflater, container, false)
        return Binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val imageList = ArrayList<SlideModel>()
        imageList.add(SlideModel(R.drawable.promotion, ScaleTypes.FIT))
        imageList.add(SlideModel(R.drawable.promotion, ScaleTypes.FIT))
        imageList.add(SlideModel(R.drawable.promotion, ScaleTypes.FIT))

        val imageSlider = Binding.imageSlider
        imageSlider.setImageList(imageList)
        imageSlider.setImageList(imageList, ScaleTypes.FIT)

        val foodNames = listOf("NonVeg Biryani", "Pancake", "Momos", "Veg Biryani")
        val prices = listOf("$10", "$8", "$7", "$9")
        val foodimages =
            listOf(R.drawable.menu1, R.drawable.menu2, R.drawable.menu3, R.drawable.menu4)

        val adapter = popularadapter(foodNames, prices, foodimages)
        Binding.popularRecyclerview.layoutManager =
            LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        Binding.popularRecyclerview.adapter = adapter

    }

}