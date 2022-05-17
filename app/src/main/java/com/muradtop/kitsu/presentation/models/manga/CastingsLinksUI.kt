package com.muradtop.kitsu.presentation.models.manga

import com.muradtop.kitsu.domain.models.manga.LinksXXXModel

data class LinksXXXUI(
    val self: String,
    val related: String
)

fun com.muradtop.kitsu.domain.models.manga.LinksXXXModel.toUI() = LinksXXXUI(
    self, related
)