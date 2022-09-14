package com.myproject.houseworksolution.utils

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.myproject.houseworksolution.R

@BindingAdapter("imgUrl")
fun loadImageUrl(imageView: ImageView, imgUrl: String) {
    Glide.with(imageView)
        .load(imgUrl)
        .placeholder(R.color.colorPrimaryDark)
        .into(imageView)
}