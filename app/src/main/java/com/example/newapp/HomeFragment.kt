package com.example.newapp

import android.os.Bundle
import android.text.Layout.Directions
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.newapp.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
    private lateinit var binding: FragmentHomeBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(layoutInflater)

        fun openPage(){
            val action = HomeFragmentDirections.actionHomeFragmentToProductListFragment()
            findNavController().navigate(action)
        }

        binding.btnkecid1.setOnClickListener {
            openPage()
        }
        return binding.root
    }

}