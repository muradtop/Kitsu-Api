package com.muradtop.kitsu.presentation.models.manga

import com.muradtop.kitsu.domain.models.manga.LargeXModel

data class LargeXUI(
    val width: Int?,
    val height: Int?
)

fun com.muradtop.kitsu.domain.models.manga.LargeXModel.toUI() = LargeXUI(width, height)