package com.muradtop.kitsu.data.remote.dtos.anime


import com.google.gson.annotations.SerializedName
import com.muradtop.kitsu.domain.models.anime.LinksXXXModel

data class LinksXXX(
    @SerializedName("self")
    val self: String,
    @SerializedName("related")
    val related: String
)

fun LinksXXX.toDomain() = com.muradtop.kitsu.domain.models.anime.LinksXXXModel(
    self, related
)