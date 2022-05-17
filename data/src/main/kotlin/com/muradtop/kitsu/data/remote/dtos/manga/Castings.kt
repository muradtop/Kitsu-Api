package com.muradtop.kitsu.data.remote.dtos.manga


import com.google.gson.annotations.SerializedName
import com.muradtop.kitsu.domain.models.manga.CastingsModel

data class Castings(
    @SerializedName("links")
    val links: LinksXXX
)

fun Castings.toDomain() = com.muradtop.kitsu.domain.models.manga.CastingsModel(
    links.toDomain()
)