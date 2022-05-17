package com.muradtop.kitsu.data.remote.dtos.anime


import com.google.gson.annotations.SerializedName
import com.muradtop.kitsu.domain.models.anime.LinksXXXXXXXXXXXXModel

data class LinksXXXXXXXXXXXX(
    @SerializedName("self")
    val self: String,
    @SerializedName("related")
    val related: String
)

fun LinksXXXXXXXXXXXX.toDomain() = com.muradtop.kitsu.domain.models.anime.LinksXXXXXXXXXXXXModel(
    self, related
)