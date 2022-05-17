package com.muradtop.kitsu.domain.models.anime

data class DimensionsModel(
    val tiny: com.muradtop.kitsu.domain.models.anime.TinyModel,
    val small: com.muradtop.kitsu.domain.models.anime.SmallModel,
    val medium: com.muradtop.kitsu.domain.models.anime.MediumModel,
    val large: com.muradtop.kitsu.domain.models.anime.LargeModel
)