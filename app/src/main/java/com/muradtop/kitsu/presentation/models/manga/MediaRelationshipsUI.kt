package com.muradtop.kitsu.presentation.models.manga

import com.muradtop.kitsu.domain.models.manga.MediaRelationshipsModel

data class MediaRelationshipsUI(
    val links: LinksXXXXXXXUI
)

fun com.muradtop.kitsu.domain.models.manga.MediaRelationshipsModel.toUI() = MediaRelationshipsUI(links.toUI())