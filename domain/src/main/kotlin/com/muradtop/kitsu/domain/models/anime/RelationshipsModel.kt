package com.muradtop.kitsu.domain.models.anime

data class RelationshipsModel(

    val genres: com.muradtop.kitsu.domain.models.anime.GenresModel?,
    val categories: com.muradtop.kitsu.domain.models.anime.CategoriesModel?,
    val castings: com.muradtop.kitsu.domain.models.anime.CastingsModel?,
    val installments: com.muradtop.kitsu.domain.models.anime.InstallmentsModel?,
    val mappings: com.muradtop.kitsu.domain.models.anime.MappingsModel?,
    val reviews: com.muradtop.kitsu.domain.models.anime.ReviewsModel?,
    val mediaRelationships: com.muradtop.kitsu.domain.models.anime.MediaRelationshipsModel?,
    val episodes: com.muradtop.kitsu.domain.models.anime.EpisodesModel?,
    val streamingLinks: com.muradtop.kitsu.domain.models.anime.StreamingLinksModel?,
    val animeProductions: com.muradtop.kitsu.domain.models.anime.AnimeProductionsModel?,
    val animeCharacters: com.muradtop.kitsu.domain.models.anime.AnimeCharactersModel?,
    val animeStaff: com.muradtop.kitsu.domain.models.anime.AnimeStaffModel?
)
