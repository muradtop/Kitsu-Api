package com.muradtop.kitsu.presentation.models.manga

import com.muradtop.kitsu.domain.models.manga.ReviewsModel

data class ReviewsUI(
    val links:
    LinksXXXXXXUI
)

fun com.muradtop.kitsu.domain.models.manga.ReviewsModel.toUI() = ReviewsUI(links.toUI())