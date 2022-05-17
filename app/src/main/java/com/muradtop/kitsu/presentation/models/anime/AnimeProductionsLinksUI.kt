package com.muradtop.kitsu.presentation.models.anime

import com.muradtop.kitsu.domain.models.anime.LinksXXXXXXXXXXModel

data class LinksXXXXXXXXXXUI(
    val self: String,
    val related: String
)

fun com.muradtop.kitsu.domain.models.anime.LinksXXXXXXXXXXModel.toUI() = LinksXXXXXXXXXXUI(self, related)
