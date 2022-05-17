package com.muradtop.kitsu.presentation.models.manga

import com.muradtop.kitsu.domain.models.manga.LinksXXXXXXXXXModel

data class LinksXXXXXXXXXUI(
    val self: String,
    val related: String
)

fun com.muradtop.kitsu.domain.models.manga.LinksXXXXXXXXXModel.toUI() = LinksXXXXXXXXXUI(self, related)
