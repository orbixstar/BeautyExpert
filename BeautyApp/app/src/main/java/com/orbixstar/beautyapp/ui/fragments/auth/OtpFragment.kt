package com.orbixstar.beautyapp.ui.fragments.auth

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.orbixstar.beautyapp.R
import com.orbixstar.beautyapp.databinding.FragmentOtpBinding
import com.orbixstar.beautyapp.databinding.FragmentSignInBinding
import com.orbixstar.beautyapp.wrappers.AuthWrapper

class OtpFragment : Fragment() {
    lateinit var binding: FragmentOtpBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_otp, container, false)
        init()
        return binding.root
    }

    private fun init(){
        binding.btnNext.setOnClickListener {
            AuthWrapper.showInfo()
        }

        binding.btnResend.setOnClickListener {

        }
    }

}