package com.muradtop.kitsu.presentation.models.manga

import com.muradtop.kitsu.domain.models.manga.GenresModel
import com.muradtop.kitsu.presentation.models.anime.LinksXUI
import com.muradtop.kitsu.presentation.models.anime.toUI


data class GenresUI(
    val links: LinksXUI
)

fun GenresModel.toUI() = GenresUI(links.toUI())