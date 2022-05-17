package com.muradtop.kitsu.presentation.models.anime

import com.muradtop.kitsu.domain.models.anime.SmallXModel

data class SmallXUI(
    val width: Int?,
    val height: Int?
)

fun com.muradtop.kitsu.domain.models.anime.SmallXModel.toUI() = SmallXUI(width, height)
