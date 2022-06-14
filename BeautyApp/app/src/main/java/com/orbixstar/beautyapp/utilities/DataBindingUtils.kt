package com.orbixstar.beautyapp.utilities

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide

class DataBindingUtils {
    companion object {

        @BindingAdapter("load_image")
        @JvmStatic
        fun loadImage(view: ImageView, url: String?) {
            if (url != null)
                Glide.with(view.context)
                    .load(url)
                    .into(view)
        }

    }
}