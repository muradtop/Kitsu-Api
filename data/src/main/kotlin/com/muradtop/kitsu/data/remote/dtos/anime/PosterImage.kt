package com.muradtop.kitsu.data.remote.dtos.anime


import com.google.gson.annotations.SerializedName
import com.muradtop.kitsu.domain.models.anime.PosterImageModel

data class PosterImage(
    @SerializedName("tiny")
    val tiny: String,
    @SerializedName("small")
    val small: String,
    @SerializedName("medium")
    val medium: String,
    @SerializedName("large")
    val large: String,
    @SerializedName("original")
    val original: String,
    @SerializedName("meta")
    val meta: Meta
)

fun PosterImage.toDomain() = com.muradtop.kitsu.domain.models.anime.PosterImageModel(
    tiny,
    small,
    medium,
    large,
    original,
    meta.toDomain()
)