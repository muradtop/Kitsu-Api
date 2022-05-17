package com.muradtop.kitsu.domain.useCases

import com.muradtop.kitsu.domain.repositories.MangaRepository
import javax.inject.Inject

class FetchDetailedMangaUseCase @Inject constructor(
    private val mangaRepository: com.muradtop.kitsu.domain.repositories.MangaRepository
) {
    operator fun invoke(id: String) = mangaRepository.fetchDetailedManga(id)
}