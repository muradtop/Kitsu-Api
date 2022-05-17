package com.muradtop.kitsu.presentation.models.manga

import com.muradtop.kitsu.domain.models.manga.LargeModel

data class LargeUI(
    val width: Int?,
    val height: Int?
)

fun com.muradtop.kitsu.domain.models.manga.LargeModel.toUI() = LargeUI(width, height)
