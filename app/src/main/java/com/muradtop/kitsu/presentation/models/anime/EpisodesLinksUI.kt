package com.muradtop.kitsu.presentation.models.anime

import com.muradtop.kitsu.domain.models.anime.LinksXXXXXXXXModel

data class LinksXXXXXXXXUI(
    val self: String,
    val related: String
)

fun com.muradtop.kitsu.domain.models.anime.LinksXXXXXXXXModel.toUI() = LinksXXXXXXXXUI(self, related)
