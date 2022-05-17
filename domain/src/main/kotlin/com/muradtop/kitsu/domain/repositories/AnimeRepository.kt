package com.muradtop.kitsu.domain.repositories

import com.muradtop.kitsu.domain.either.Either
import com.muradtop.kitsu.domain.models.anime.SingleAnimeModel
import kotlinx.coroutines.flow.Flow

interface AnimeRepository {
    fun fetchAnimeDetails(id: String): Flow<Either<String, SingleAnimeModel>>
}