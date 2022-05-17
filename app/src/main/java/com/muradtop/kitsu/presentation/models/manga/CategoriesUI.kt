package com.muradtop.kitsu.presentation.models.manga

import com.muradtop.kitsu.domain.models.manga.CategoriesModel
import com.muradtop.kitsu.presentation.models.anime.toUI
import com.muradtop.kitsu.presentation.models.anime.LinksXXUI


data class CategoriesUI(
    val links: LinksXXUI
)

fun CategoriesModel.toUI() = CategoriesUI(links.toUI())