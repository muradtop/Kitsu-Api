package com.muradtop.kitsu.presentation.models.manga

import com.muradtop.kitsu.domain.models.manga.MetaXXModel

data class MetaXXUI(
    val count: Int
)

fun com.muradtop.kitsu.domain.models.manga.MetaXXModel.toUI() = MetaXXUI(count)
