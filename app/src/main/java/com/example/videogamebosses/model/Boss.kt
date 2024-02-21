package com.example.videogamebosses.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Boss(
    @StringRes val nameRes: Int,
    @StringRes val DescRes: Int,
    val numBoss: Int,
    @DrawableRes val ImageRes: Int,
)
