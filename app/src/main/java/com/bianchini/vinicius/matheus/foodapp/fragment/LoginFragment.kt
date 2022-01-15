package com.bianchini.vinicius.matheus.foodapp.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.navigation.fragment.findNavController
import com.bianchini.vinicius.matheus.foodapp.R
import com.bianchini.vinicius.matheus.foodapp.databinding.FragmentLoginBinding
import kotlin.Exception

class LoginFragment : Fragment() {
    private lateinit var binding: FragmentLoginBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentLoginBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        try {
            setUpNavMenu()
            setbtnEntrarBehaviour()
            setbtnRegistrarBehaviour()
            setbtnEntrarSistemaBehaviour()
        } catch (e: Exception) {

        }
    }

    private fun setUpNavMenu() {
        requireActivity().actionBar?.hide()
    }

    private fun setFormBehaviour(entrarApp: Boolean) {
        if (entrarApp) {
            binding.editTextTextConfirmarSenha.visibility = View.GONE
            binding.btnEntrarSistema.setText(R.string.text_entrar)
        } else {
            binding.editTextTextConfirmarSenha.visibility = View.VISIBLE
            binding.btnEntrarSistema.setText(R.string.text_registrar)
        }
    }

    private fun setbtnEntrarBehaviour() {
        binding.btnEntrar.setOnClickListener {
            setFormBehaviour(true)
        }
    }

    private fun setbtnRegistrarBehaviour() {
        binding.btnRegistrar.setOnClickListener {
            setFormBehaviour(false)
        }
    }

    private fun setbtnEntrarSistemaBehaviour() {
        binding.btnEntrarSistema.setOnClickListener {
            findNavController().navigate(R.id.action_loginFragment_to_homeFragment)
        }
    }
}