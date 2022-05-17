package com.muradtop.kitsu.presentation.models.manga

import com.muradtop.kitsu.domain.models.manga.MappingsModel

data class MappingsUI(
    val links: LinksXXXXXUI
)

fun com.muradtop.kitsu.domain.models.manga.MappingsModel.toUI() = MappingsUI(links.toUI())