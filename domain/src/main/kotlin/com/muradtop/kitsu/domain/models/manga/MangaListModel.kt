package com.muradtop.kitsu.domain.models.manga

data class MangaListModel(
    val data: List<com.muradtop.kitsu.domain.models.manga.MangaDataModel>,
    val meta: com.muradtop.kitsu.domain.models.manga.MetaXXModel,
    val links: com.muradtop.kitsu.domain.models.manga.LinksXXXXXXXXXXXModel
)