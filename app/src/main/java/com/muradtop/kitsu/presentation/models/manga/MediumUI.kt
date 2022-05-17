package com.muradtop.kitsu.presentation.models.manga

import com.muradtop.kitsu.domain.models.manga.MediumModel

data class MediumUI(
    val width: Int?,
    val height: Int?
)

fun com.muradtop.kitsu.domain.models.manga.MediumModel.toUI() = MediumUI(width, height)
