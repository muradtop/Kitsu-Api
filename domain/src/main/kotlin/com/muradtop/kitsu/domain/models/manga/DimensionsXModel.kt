package com.muradtop.kitsu.domain.models.manga

data class DimensionsXModel(
    val tiny: com.muradtop.kitsu.domain.models.manga.TinyXModel,
    val small: com.muradtop.kitsu.domain.models.manga.SmallXModel,
    val large: com.muradtop.kitsu.domain.models.manga.LargeXModel
)