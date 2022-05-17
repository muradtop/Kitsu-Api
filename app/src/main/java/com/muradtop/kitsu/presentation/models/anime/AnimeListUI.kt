package com.muradtop.kitsu.presentation.models.anime


data class AnimeListUI(
    val data: List<AnimeDataUI>,
    val meta: MetaXXUI? = null,
    val links: LinksXXXXXXXXXXXXXUI? = null
)

fun com.muradtop.kitsu.domain.models.anime.AnimeListModel.toUI() = AnimeListUI(data.map { it.toUI() }, meta?.toUI(), links?.toUI())
