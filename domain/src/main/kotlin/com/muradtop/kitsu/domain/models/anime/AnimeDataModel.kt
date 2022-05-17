package com.muradtop.kitsu.domain.models.anime


data class AnimeDataModel(
    val id: String,
    val type: String?,
    val links: com.muradtop.kitsu.domain.models.anime.LinksModel?,
    val animeDto: com.muradtop.kitsu.domain.models.anime.AnimeModel,
    val relationships: com.muradtop.kitsu.domain.models.anime.RelationshipsModel?
)
