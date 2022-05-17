package com.muradtop.kitsu.presentation.models.anime

import com.muradtop.kitsu.domain.models.anime.LargeXModel

data class LargeXUI(
    val width: Int?,
    val height: Int?
)

fun com.muradtop.kitsu.domain.models.anime.LargeXModel.toUI() = LargeXUI(width, height)
