package com.muradtop.kitsu.presentation.models.anime

import com.muradtop.kitsu.domain.models.anime.MediaRelationshipsModel

data class MediaRelationshipsUI(
    val links: LinksXXXXXXXUI
)

fun com.muradtop.kitsu.domain.models.anime.MediaRelationshipsModel.toUI() = MediaRelationshipsUI(links.toUI())
