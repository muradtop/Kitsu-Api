package com.muradtop.kitsu.presentation.models.anime

import com.muradtop.kitsu.domain.models.anime.LinksXXModel

data class LinksXXUI(
    val self: String,
    val related: String
)

fun com.muradtop.kitsu.domain.models.anime.LinksXXModel.toUI() = LinksXXUI(self, related)