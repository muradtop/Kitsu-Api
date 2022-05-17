package com.muradtop.kitsu.presentation.models.anime

import com.muradtop.kitsu.domain.models.anime.StreamingLinksModel

data class StreamingLinksUI(
    val links: LinksXXXXXXXXXUI
)

fun com.muradtop.kitsu.domain.models.anime.StreamingLinksModel.toUI() = StreamingLinksUI(links.toUI())
