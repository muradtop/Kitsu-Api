package com.muradtop.kitsu.presentation.models.manga

import com.muradtop.kitsu.domain.models.manga.MetaXModel

data class MetaXUI(
    val dimensionsXUI: DimensionsXUI
)

fun com.muradtop.kitsu.domain.models.manga.MetaXModel.toUI() = MetaXUI(dimensionsXModel.toUI())
