package com.muradtop.kitsu.presentation.models.anime

import com.muradtop.kitsu.domain.models.anime.AnimeDataModel
import com.timplifier.kitsu.presentation.base.BaseDiffModel

data class AnimeDataUI(
    override val id: String,
    val type: String?,
    val links: LinksUI?,
    val animeDto: AnimeUI,
    val relationships: RelationshipsUI?
) : BaseDiffModel

fun com.muradtop.kitsu.domain.models.anime.AnimeDataModel.toUI() =
    AnimeDataUI(id, type, links?.toUI(), animeDto.toUI(), relationships?.toUI())
