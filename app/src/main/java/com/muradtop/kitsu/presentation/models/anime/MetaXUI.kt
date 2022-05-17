package com.muradtop.kitsu.presentation.models.anime

import com.muradtop.kitsu.domain.models.anime.MetaXModel

data class MetaXUI(
    val dimensions: DimensionsXUI
)

fun com.muradtop.kitsu.domain.models.anime.MetaXModel.toUI() = MetaXUI(dimensionsXModel.toUI())
