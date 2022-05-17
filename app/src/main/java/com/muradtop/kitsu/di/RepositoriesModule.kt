package com.muradtop.kitsu.di

import com.timplifier.kitsu.data.repositories.AnimeRepositoryImpl
import com.timplifier.kitsu.data.repositories.AuthenticationRepositoryImpl
import com.timplifier.kitsu.data.repositories.MangaRepositoryImpl
import com.muradtop.kitsu.domain.repositories.AnimeRepository
import com.muradtop.kitsu.domain.repositories.AuthenticationRepository
import com.muradtop.kitsu.domain.repositories.MangaRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoriesModule {
    @Binds
    abstract fun bindAnimeRepository(
        animeRepositoryImpl: AnimeRepositoryImpl
    ): com.muradtop.kitsu.domain.repositories.AnimeRepository

    @Binds
    abstract fun bindMangaRepository(mangaRepositoryImpl: MangaRepositoryImpl): com.muradtop.kitsu.domain.repositories.MangaRepository

    @Binds
    abstract fun bindAuthenticationRepository(authenticationRepositoryImpl: AuthenticationRepositoryImpl): com.muradtop.kitsu.domain.repositories.AuthenticationRepository
}