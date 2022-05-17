package com.muradtop.kitsu.presentation.models.manga

import com.muradtop.kitsu.domain.models.manga.LinksXXModel

data class LinksXXUI(
    val self: String,
    val related: String
)

fun com.muradtop.kitsu.domain.models.manga.LinksXXModel.toUI() = LinksXXUI(self, related)
