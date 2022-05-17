package com.muradtop.kitsu.data.remote.dtos.anime


import com.google.gson.annotations.SerializedName
import com.muradtop.kitsu.domain.models.anime.StreamingLinksModel

data class StreamingLinks(
    @SerializedName("links")
    val links: LinksXXXXXXXXX
)

fun StreamingLinks.toDomain() =
    com.muradtop.kitsu.domain.models.anime.StreamingLinksModel(links.toDomain())