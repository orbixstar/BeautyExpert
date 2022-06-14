package com.orbixstar.beautyapp.ui.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.orbixstar.beautyapp.R
import com.orbixstar.beautyapp.databinding.ActivityAuthBinding
import com.orbixstar.beautyapp.databinding.ActivityTutorialBinding
import com.orbixstar.beautyapp.wrappers.AuthWrapper
import com.orbixstar.beautyapp.wrappers.TutorialWrapper

class AuthActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAuthBinding
    private lateinit var navHostFragment: NavHostFragment
    private lateinit var navController: NavController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_auth)
        binding.lifecycleOwner = this
        init()
    }

    private fun init() {

        navHostFragment =
            supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        navController = navHostFragment.navController
        binding.rootView.post { AuthWrapper.init(this) }
        
    }
}