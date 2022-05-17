package com.muradtop.kitsu.presentation.models.anime

import com.muradtop.kitsu.domain.models.anime.MappingsModel

data class MappingsUI(
    val links: LinksXXXXXUI
)

fun com.muradtop.kitsu.domain.models.anime.MappingsModel.toUI() = MappingsUI(links.toUI())