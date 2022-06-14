package com.orbixstar.beautyapp.wrappers

import android.content.Context
import androidx.annotation.StringRes
import com.orbixstar.beautyapp.app.ApplicationClass

open class AppWrapper{
    fun getContext(): Context {
        return ApplicationClass.instance!!
    }
    fun getString(@StringRes stringRes: Int): String {
        return ApplicationClass.instance!!.getString(stringRes)
    }
}