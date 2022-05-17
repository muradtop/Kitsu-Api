package com.muradtop.kitsu.data.remote.dtos.anime


import com.google.gson.annotations.SerializedName
import com.muradtop.kitsu.domain.models.anime.AnimeStaffModel

data class AnimeStaff(
    @SerializedName("links")
    val links: LinksXXXXXXXXXXXX
)

fun AnimeStaff.toDomain() = com.muradtop.kitsu.domain.models.anime.AnimeStaffModel(
    links.toDomain()
)