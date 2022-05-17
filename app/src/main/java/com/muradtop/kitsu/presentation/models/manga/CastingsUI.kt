package com.muradtop.kitsu.presentation.models.manga

import com.muradtop.kitsu.domain.models.manga.CastingsModel

data class CastingsUI(
    val links: LinksXXXUI
)

fun com.muradtop.kitsu.domain.models.manga.CastingsModel.toUI() = CastingsUI(
    links.toUI()
)
