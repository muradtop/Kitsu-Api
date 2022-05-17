package com.muradtop.kitsu.presentation.models.anime

import com.muradtop.kitsu.domain.models.anime.InstallmentsModel

data class InstallmentsUI(
    val links: LinksXXXXUI
)

fun com.muradtop.kitsu.domain.models.anime.InstallmentsModel.toUI() = InstallmentsUI(links.toUI())
