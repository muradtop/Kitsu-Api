package com.muradtop.kitsu.presentation.ui.fragments.anime.detailed

import com.muradtop.kitsu.domain.useCases.FetchAnimeUseCase
import com.muradtop.kitsu.presentation.base.BaseViewModel
import com.muradtop.kitsu.presentation.models.anime.SingleAnimeUI
import com.muradtop.kitsu.presentation.models.anime.toUI
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject

@HiltViewModel
class DetailedAnimeViewModel @Inject constructor(
    private val fetchAnimeUseCase: FetchAnimeUseCase
) : BaseViewModel() {
    private val _animeDetailedState =  mutableUiStateFlow<SingleAnimeUI>()
    var animeDetailedState =_animeDetailedState.asStateFlow()

    fun fetchADetailedAnime(id : String) =
        fetchAnimeUseCase(id).gatherRequest(_animeDetailedState){it.toUI()}
}