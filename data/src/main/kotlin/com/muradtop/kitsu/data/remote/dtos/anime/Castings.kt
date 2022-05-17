package com.muradtop.kitsu.data.remote.dtos.anime


import com.google.gson.annotations.SerializedName
import com.muradtop.kitsu.domain.models.anime.CastingsModel

data class Castings(
    @SerializedName("links")
    val links: LinksXXX
)

fun Castings.toDomain() = com.muradtop.kitsu.domain.models.anime.CastingsModel(
    links.toDomain()
)