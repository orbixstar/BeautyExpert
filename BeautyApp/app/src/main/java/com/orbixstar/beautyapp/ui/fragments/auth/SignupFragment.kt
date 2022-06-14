package com.orbixstar.beautyapp.ui.fragments.auth

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.orbixstar.beautyapp.R
import com.orbixstar.beautyapp.databinding.FragmentOtpBinding
import com.orbixstar.beautyapp.databinding.FragmentSignupBinding
import com.orbixstar.beautyapp.wrappers.AuthWrapper

class SignupFragment : Fragment() {
    lateinit var binding: FragmentSignupBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_signup, container, false)
        init()
        return binding.root
    }

    private fun init(){
        binding.btnNext.setOnClickListener {
            AuthWrapper.showOtp()
        }

        binding.btnSignin.setOnClickListener {
            AuthWrapper.showSignIn()

        }
    }


}