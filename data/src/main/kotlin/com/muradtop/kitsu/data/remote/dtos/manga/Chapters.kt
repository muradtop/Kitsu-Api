package com.muradtop.kitsu.data.remote.dtos.manga


import com.google.gson.annotations.SerializedName
import com.muradtop.kitsu.domain.models.manga.ChaptersModel

data class Chapters(
    @SerializedName("links")
    val links: LinksXXXXXXXX
)

fun Chapters.toDomain() = com.muradtop.kitsu.domain.models.manga.ChaptersModel(
    links.toDomain()
)