package com.muradtop.kitsu.presentation.models.manga

import com.muradtop.kitsu.domain.models.manga.CategoriesModel

data class CategoriesUI(
    val links: LinksXXUI
)

fun com.muradtop.kitsu.domain.models.manga.CategoriesModel.toUI() = CategoriesUI(links.toUI())