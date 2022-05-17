package com.muradtop.kitsu.presentation.models.anime

import com.muradtop.kitsu.domain.models.anime.LinksXXXModel

data class LinksXXXUI(
    val self: String,
    val related: String
)

fun com.muradtop.kitsu.domain.models.anime.LinksXXXModel.toUI() = LinksXXXUI(self, related)
