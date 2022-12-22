package com.softsquared.template.kotlin.src.main.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.softsquared.template.kotlin.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
    private lateinit var binding : FragmentHomeBinding
    private val dataList = ArrayList<Data>()


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?


    ): View? {
        binding = FragmentHomeBinding.inflate(inflater,container,false)




        dataList.add(Data("df","dd","dd","dd","dd","dd","dd"))
        val adapter = context?.let { RvAdapter(it,dataList) }
        binding.rvHome.adapter= adapter

        binding.rvHome.layoutManager= LinearLayoutManager(context)

        return binding.root
    }

}