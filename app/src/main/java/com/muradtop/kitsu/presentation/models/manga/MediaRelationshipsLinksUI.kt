package com.muradtop.kitsu.presentation.models.manga

import com.muradtop.kitsu.domain.models.manga.LinksXXXXXXXModel

data class LinksXXXXXXXUI(
    val self: String,
    val related: String
)

fun com.muradtop.kitsu.domain.models.manga.LinksXXXXXXXModel.toUI() = LinksXXXXXXXUI(self, related)
