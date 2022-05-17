package com.muradtop.kitsu.data.remote.dtos.anime


import com.google.gson.annotations.SerializedName
import com.muradtop.kitsu.domain.models.anime.AnimeDataModel

data class AnimeDataDto(
    @SerializedName("id")
    val id: String,
    @SerializedName("type")
    val type: String?,
    @SerializedName("links")
    val links: Links?,
    @SerializedName("attributes")
    val animeDto: AnimeDto,
    @SerializedName("relationships")
    val relationships: Relationships?
)

fun AnimeDataDto.toDomain() = com.muradtop.kitsu.domain.models.anime.AnimeDataModel(
    id, type, links?.toDomain(), animeDto.toDomain(), relationships?.toDomain()
)