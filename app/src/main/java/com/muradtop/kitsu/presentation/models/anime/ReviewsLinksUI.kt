package com.muradtop.kitsu.presentation.models.anime

import com.muradtop.kitsu.domain.models.anime.LinksXXXXXXModel

data class LinksXXXXXXUI(
    val self: String,
    val related: String
)

fun com.muradtop.kitsu.domain.models.anime.LinksXXXXXXModel.toUI() = LinksXXXXXXUI(self, related)
