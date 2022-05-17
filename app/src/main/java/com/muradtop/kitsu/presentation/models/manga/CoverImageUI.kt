package com.muradtop.kitsu.presentation.models.manga

import com.muradtop.kitsu.domain.models.manga.CoverImageModel

data class CoverImageUI(
    val tiny: String,
    val small: String,
    val large: String,
    val original: String,
    val meta: MetaXUI
)

fun com.muradtop.kitsu.domain.models.manga.CoverImageModel.toUI() = CoverImageUI(tiny, small, large, original, meta.toUI())