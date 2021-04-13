package com.example.photostory.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class PhotoStory(
        @StringRes val stringResourceId: Int,
        @DrawableRes val imageResourceId: Int
)