package com.muradtop.kitsu.presentation.models.manga

import com.muradtop.kitsu.domain.models.manga.MangaCharactersModel

data class MangaCharactersUI(
    val links: LinksXXXXXXXXXUI
)

fun com.muradtop.kitsu.domain.models.manga.MangaCharactersModel.toUI() = MangaCharactersUI(links.toUI())
