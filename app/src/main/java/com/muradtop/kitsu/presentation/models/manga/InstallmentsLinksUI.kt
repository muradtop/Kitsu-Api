package com.muradtop.kitsu.presentation.models.manga

import com.muradtop.kitsu.domain.models.manga.LinksXXXXModel

data class LinksXXXXUI(
    val self: String,
    val related: String
)

fun com.muradtop.kitsu.domain.models.manga.LinksXXXXModel.toUI() = LinksXXXXUI(self, related)
