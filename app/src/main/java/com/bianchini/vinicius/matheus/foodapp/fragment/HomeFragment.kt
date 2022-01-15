package com.bianchini.vinicius.matheus.foodapp.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bianchini.vinicius.matheus.foodapp.R
import com.bianchini.vinicius.matheus.foodapp.databinding.FragmentHome2Binding
import com.bianchini.vinicius.matheus.foodapp.databinding.FragmentLoginBinding


class HomeFragment : Fragment() {
    private lateinit var binding: FragmentHome2Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHome2Binding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }
}