package com.muradtop.kitsu.presentation.models.anime

import com.muradtop.kitsu.domain.models.anime.MetaXXModel

data class MetaXXUI(
    val count: Int
)

fun com.muradtop.kitsu.domain.models.anime.MetaXXModel.toUI() = MetaXXUI(count)
