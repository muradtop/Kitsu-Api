package com.muradtop.kitsu.domain.useCases

import com.muradtop.kitsu.domain.repositories.AnimeRepository
import javax.inject.Inject

class FetchAnimeUseCase @Inject constructor(private val repository: AnimeRepository) {
    operator fun invoke(id:String) = repository.fetchAnimeDetails(id )
}