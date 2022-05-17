package com.muradtop.kitsu.domain.useCases

import com.muradtop.kitsu.domain.repositories.AnimeRepository
import javax.inject.Inject

class FetchSingleAnimeUseCase @Inject constructor(
    private val animeRepository: com.muradtop.kitsu.domain.repositories.AnimeRepository
) {
    operator fun invoke(id: String) = animeRepository.fetchAnimeDetails(id)
}