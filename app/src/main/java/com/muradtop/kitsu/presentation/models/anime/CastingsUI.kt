package com.muradtop.kitsu.presentation.models.anime

import com.muradtop.kitsu.domain.models.anime.CastingsModel

data class CastingsUI(
    val links: LinksXXXUI
)

fun com.muradtop.kitsu.domain.models.anime.CastingsModel.toUI() = CastingsUI(links.toUI())
