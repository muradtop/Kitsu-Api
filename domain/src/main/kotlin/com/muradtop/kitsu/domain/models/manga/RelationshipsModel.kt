package com.muradtop.kitsu.domain.models.manga

data class RelationshipsModel(
    val genres: com.muradtop.kitsu.domain.models.manga.GenresModel,
    val categories: com.muradtop.kitsu.domain.models.manga.CategoriesModel,
    val castings: com.muradtop.kitsu.domain.models.manga.CastingsModel,
    val installments: com.muradtop.kitsu.domain.models.manga.InstallmentsModel,
    val mappings: com.muradtop.kitsu.domain.models.manga.MappingsModel,
    val reviews: com.muradtop.kitsu.domain.models.manga.ReviewsModel,
    val mediaRelationships: com.muradtop.kitsu.domain.models.manga.MediaRelationshipsModel,
    val chapters: com.muradtop.kitsu.domain.models.manga.ChaptersModel,
    val mangaCharacters: com.muradtop.kitsu.domain.models.manga.MangaCharactersModel,
    val mangaStaff: com.muradtop.kitsu.domain.models.manga.MangaStaffModel
)
