package com.muradtop.kitsu.presentation.models.manga

import com.muradtop.kitsu.domain.models.manga.ChaptersModel

data class ChaptersUI(
    val links: LinksXXXXXXXXUI
)

fun com.muradtop.kitsu.domain.models.manga.ChaptersModel.toUI() = ChaptersUI(links.toUI())