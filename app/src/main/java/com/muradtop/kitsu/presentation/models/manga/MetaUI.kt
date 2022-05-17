package com.muradtop.kitsu.presentation.models.manga

import com.muradtop.kitsu.domain.models.manga.MetaModel

data class MetaUI(
    val dimensionsModel: DimensionsUI
)

fun com.muradtop.kitsu.domain.models.manga.MetaModel.toUI() = MetaUI(dimensionsModel.toUI())