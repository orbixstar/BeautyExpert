package com.orbixstar.beautyapp.wrappers

import android.annotation.SuppressLint
import android.app.Activity
import androidx.navigation.NavController
import androidx.navigation.NavOptions
import androidx.navigation.Navigation
import com.orbixstar.beautyapp.R

class AuthWrapper: AppWrapper() {

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

        fun showSignIn() {
            if (navController != null) {
                navController!!.navigate(R.id.signInFragment, null, getPopUpHomeNavOption())
            }
        }

        fun showSignUp() {
            if (navController != null) {
                navController!!.navigate(R.id.signupFragment, null, getPopUpHomeNavOption())
            }
        }

        fun showOtp() {
            if (navController != null) {
                navController!!.navigate(R.id.otpFragment, null, getPopUpHomeNavOption())
            }
        }

        fun showInfo() {
            if (navController != null) {
                navController!!.navigate(R.id.infoFragment, null, getPopUpHomeNavOption())
            }
        }

        fun showForgot() {
            if (navController != null) {
                navController!!.navigate(R.id.forgotFragment, null, getPopUpHomeNavOption())
            }
        }
        fun showForgotOtp() {
            if (navController != null) {
                navController!!.navigate(R.id.forgotOtpFragment, null, getPopUpHomeNavOption())
            }
        }

    }
}