package com.orbixstar.beautyapp.wrappers

import android.annotation.SuppressLint
import android.app.Activity
import androidx.navigation.NavController
import androidx.navigation.NavOptions
import androidx.navigation.Navigation
import com.orbixstar.beautyapp.R

class TutorialWrapper: AppWrapper() {

    companion object {
        @SuppressLint("StaticFieldLeak")
        private const val viewId: Int = R.id.nav_host_fragment
        @SuppressLint("StaticFieldLeak")
        private var navController: NavController? = null

        fun init(mainActivity: Activity?) {
            if (mainActivity != null) {
                navController = Navigation.findNavController(mainActivity, viewId)
            }
        }

        private fun getPopUpHomeNavOption(): NavOptions {
            val navBuilder = NavOptions.Builder()
//            navBuilder.setEnterAnim(R.anim.slide_in).setExitAnim(R.anim.fade_out)
//                .setPopEnterAnim(R.anim.slide_in).setPopExitAnim(R.anim.fade_out)

            return navBuilder.build()
        }

        fun showTab2() {
            if (navController != null) {
                navController!!.navigate(R.id.tutorial2Fragment, null, getPopUpHomeNavOption())
            }
        }

        fun showTab3() {
            if (navController != null) {
                navController!!.navigate(R.id.tutorial3Fragment, null, getPopUpHomeNavOption())
            }
        }

    }
}