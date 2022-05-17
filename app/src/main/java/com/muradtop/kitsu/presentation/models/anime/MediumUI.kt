package com.muradtop.kitsu.presentation.models.anime

import com.muradtop.kitsu.domain.models.anime.MediumModel

data class MediumUI(
    val width: Int?,
    val height: Int?
)

fun com.muradtop.kitsu.domain.models.anime.MediumModel.toUI() = MediumUI(width, height)
