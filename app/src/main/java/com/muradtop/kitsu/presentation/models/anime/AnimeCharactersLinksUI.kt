package com.muradtop.kitsu.presentation.models.anime


data class LinksXXXXXXXXXXXUI(
    val self: String,
    val related: String
)

fun com.muradtop.kitsu.domain.models.anime.LinksXXXXXXXXXXXModel.toUI() = LinksXXXXXXXXXXXUI(self, related)
