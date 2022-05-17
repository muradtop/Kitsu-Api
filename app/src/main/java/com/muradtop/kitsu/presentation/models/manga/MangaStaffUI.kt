package com.muradtop.kitsu.presentation.models.manga

import com.muradtop.kitsu.domain.models.manga.MangaStaffModel

data class MangaStaffUI(
    val links: LinksXXXXXXXXXXUI
)

fun com.muradtop.kitsu.domain.models.manga.MangaStaffModel.toUI() = MangaStaffUI(links.toUI())
