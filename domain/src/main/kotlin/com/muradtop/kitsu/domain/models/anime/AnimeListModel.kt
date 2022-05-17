package com.muradtop.kitsu.domain.models.anime

data class AnimeListModel(
    val data: List<com.muradtop.kitsu.domain.models.anime.AnimeDataModel>,
    val meta: com.muradtop.kitsu.domain.models.anime.MetaXXModel? = null,
    val links: com.muradtop.kitsu.domain.models.anime.LinksXXXXXXXXXXXXXModel? = null
)
