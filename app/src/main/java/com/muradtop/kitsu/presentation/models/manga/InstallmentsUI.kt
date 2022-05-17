package com.muradtop.kitsu.presentation.models.manga

import com.muradtop.kitsu.domain.models.manga.InstallmentsModel

data class InstallmentsUI(
    val links: LinksXXXXUI
)

fun com.muradtop.kitsu.domain.models.manga.InstallmentsModel.toUI() = InstallmentsUI(links.toUI())
