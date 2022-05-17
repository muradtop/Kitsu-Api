package com.muradtop.kitsu.presentation.models.anime

import com.muradtop.kitsu.domain.models.anime.SingleAnimeModel

data class SingleAnimeUI(
    val data: AnimeDataUI
)

fun com.muradtop.kitsu.domain.models.anime.SingleAnimeModel.toUI() = SingleAnimeUI(data.toUI())
