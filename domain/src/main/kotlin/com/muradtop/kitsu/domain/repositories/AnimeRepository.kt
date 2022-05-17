package com.muradtop.kitsu.domain.repositories

import com.muradtop.kitsu.domain.either.Either
import com.muradtop.kitsu.domain.models.anime.SingleAnimeModel
import kotlinx.coroutines.flow.Flow

interface AnimeRepository {
    fun fetchAnimeDetails(id: String): Flow<com.muradtop.kitsu.domain.either.Either<String, com.muradtop.kitsu.domain.models.anime.SingleAnimeModel>>
}