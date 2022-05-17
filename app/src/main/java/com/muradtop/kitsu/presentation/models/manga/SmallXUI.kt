package com.muradtop.kitsu.presentation.models.manga

import com.muradtop.kitsu.domain.models.manga.SmallXModel

data class SmallXUI(
    val width: Int?,
    val height: Int?
)

fun com.muradtop.kitsu.domain.models.manga.SmallXModel.toUI() = SmallXUI(width, height)