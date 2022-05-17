package com.muradtop.kitsu.domain.models.manga

data class DimensionsModel(

    val tiny: com.muradtop.kitsu.domain.models.manga.TinyModel,
    val small: com.muradtop.kitsu.domain.models.manga.SmallModel,
    val medium: com.muradtop.kitsu.domain.models.manga.MediumModel,
    val large: com.muradtop.kitsu.domain.models.manga.LargeModel
)
