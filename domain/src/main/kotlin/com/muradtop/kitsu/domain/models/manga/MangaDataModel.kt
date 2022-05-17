package com.muradtop.kitsu.domain.models.manga

data class MangaDataModel(
    val id: String,
    val type: String,
    val links: com.muradtop.kitsu.domain.models.manga.LinksModel,
    val mangaDto: com.muradtop.kitsu.domain.models.manga.MangaModel,
    val relationships: com.muradtop.kitsu.domain.models.manga.RelationshipsModel
)
