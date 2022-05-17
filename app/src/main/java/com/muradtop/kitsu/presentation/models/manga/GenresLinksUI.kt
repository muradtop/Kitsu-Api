package com.muradtop.kitsu.presentation.models.manga

import com.muradtop.kitsu.domain.models.manga.LinksXModel

data class LinksXUI(
    val self: String,
    val related: String
)

fun com.muradtop.kitsu.domain.models.manga.LinksXModel.toUI() = LinksXUI(self, related)
