package com.orbixstar.beautyapp.ui.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.orbixstar.beautyapp.R
import com.orbixstar.beautyapp.databinding.ActivityTutorialBinding
import com.orbixstar.beautyapp.wrappers.TutorialWrapper

class TutorialActivity : AppCompatActivity() {
    private lateinit var binding: ActivityTutorialBinding
    private lateinit var navHostFragment: NavHostFragment
    private lateinit var navController: NavController
    var tabCount = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_tutorial)
        binding.lifecycleOwner = this
        init()
    }

    private fun init() {

        navHostFragment =
            supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        navController = navHostFragment.navController
        binding.rootView.post { TutorialWrapper.init(this) }

        binding.btnNext.setOnClickListener {
            when (tabCount){
                1-> {
                    TutorialWrapper.showTab2()
                    tabCount++
                }
                2-> {
                    TutorialWrapper.showTab3()
                    tabCount++
                }
                3-> {
                    startActivity(Intent(this, AuthActivity::class.java))
                }


            }
        }
    }
}