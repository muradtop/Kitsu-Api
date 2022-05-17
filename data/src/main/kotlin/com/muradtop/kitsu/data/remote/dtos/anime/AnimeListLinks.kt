package com.muradtop.kitsu.data.remote.dtos.anime


import com.google.gson.annotations.SerializedName
import com.muradtop.kitsu.domain.models.anime.LinksXXXXXXXXXXXXXModel

data class LinksXXXXXXXXXXXXX(
    @SerializedName("first")
    val first: String,
    @SerializedName("prev")
    val prev: String?,
    @SerializedName("next")
    val next: String,
    @SerializedName("last")
    val last: String
)

fun LinksXXXXXXXXXXXXX.toDomain() =
    com.muradtop.kitsu.domain.models.anime.LinksXXXXXXXXXXXXXModel(
        first, prev, next, last
    )
