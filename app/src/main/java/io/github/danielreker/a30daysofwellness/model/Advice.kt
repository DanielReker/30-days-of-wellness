package io.github.danielreker.a30daysofwellness.model

import androidx.annotation.DrawableRes

data class Advice(
    val name: String,
    val description: String,
    @DrawableRes
    val image: Int
)
