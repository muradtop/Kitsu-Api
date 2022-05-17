package com.muradtop.kitsu.presentation.models.manga

import com.muradtop.kitsu.domain.models.manga.LinksModel

data class LinksUI(
    val self: String
)

fun com.muradtop.kitsu.domain.models.manga.LinksModel.toUI() = LinksUI(self)
