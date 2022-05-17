package com.muradtop.kitsu.presentation.models.manga

import com.muradtop.kitsu.domain.models.manga.DimensionsXModel

data class DimensionsXUI(
    val tiny: TinyXUI,
    val small: SmallXUI,
    val large: LargeXUI
)

fun com.muradtop.kitsu.domain.models.manga.DimensionsXModel.toUI() = DimensionsXUI(tiny.toUI(), small.toUI(), large.toUI())
