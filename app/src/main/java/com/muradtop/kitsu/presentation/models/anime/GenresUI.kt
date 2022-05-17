package com.muradtop.kitsu.presentation.models.anime

import com.muradtop.kitsu.domain.models.anime.GenresModel

data class GenresUI(
    val linksXUI: LinksXUI
)

fun com.muradtop.kitsu.domain.models.anime.GenresModel.toUI() = GenresUI(linksXModel.toUI())
