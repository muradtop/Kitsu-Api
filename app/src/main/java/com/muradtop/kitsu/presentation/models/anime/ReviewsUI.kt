package com.muradtop.kitsu.presentation.models.anime

import com.muradtop.kitsu.domain.models.anime.ReviewsModel

data class ReviewsUI(
    val links: LinksXXXXXXUI
)

fun com.muradtop.kitsu.domain.models.anime.ReviewsModel.toUI() = ReviewsUI(links.toUI())
