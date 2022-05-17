package com.muradtop.kitsu.presentation.models.manga

import com.muradtop.kitsu.domain.models.manga.LinksXXXXXXXXXXXModel

data class LinksXXXXXXXXXXXUI(
    val first: String,
    val prev: String?,
    val next: String,
    val last: String
)

fun com.muradtop.kitsu.domain.models.manga.LinksXXXXXXXXXXXModel.toUI() = LinksXXXXXXXXXXXUI(first, prev, next, last)
