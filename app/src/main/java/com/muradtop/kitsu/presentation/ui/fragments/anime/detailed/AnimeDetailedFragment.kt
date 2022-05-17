package com.muradtop.kitsu.presentation.ui.fragments.anime.detailed

import android.content.Intent
import android.net.Uri
import android.util.Log
import androidx.core.view.isVisible
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.navArgs
import by.kirich1409.viewbindingdelegate.viewBinding
import com.muradtop.kitsu.R
import com.muradtop.kitsu.databinding.FragmentAnimeDetailedBinding
import com.muradtop.kitsu.presentation.base.BaseFragment
import com.muradtop.kitsu.presentation.extensions.loadImageWithGlide
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class AnimeDetailedFragment :
    BaseFragment<FragmentAnimeDetailedBinding, DetailedAnimeViewModel>(R.layout.fragment_anime_detailed) {
    override val binding by viewBinding(FragmentAnimeDetailedBinding::bind)
    override val viewModel: DetailedAnimeViewModel by viewModels()
    private val args: AnimeDetailedFragmentArgs by navArgs()


    override fun establishRequest() {
        viewModel.fetchADetailedAnime(args.animeId)
    }

    override fun launchObservers() {
        subscribeToAnimeDetailed()

    }

    override fun setupListeners() {
        openYoutubeAnimeTrailer()
    }

    private fun subscribeToAnimeDetailed() {
        viewModel.animeDetailedState.spectateUiState(success = {
            binding.apply {

                it.apply {
                    imCover.loadImageWithGlide(data.animeDto.coverImage?.original)
                    imPoster.loadImageWithGlide(data.animeDto.posterImage?.medium)
                    tvSubtype.text = data.animeDto.subtype?.uppercase()
                    tvYear.text = data.animeDto.createdAt
                    tvTitle.text = data.animeDto.titles?.en
                    tvSynopsis.text = data.animeDto.synopsis
                    tvAverageRating.text = "${data.animeDto.averageRating}%"
                    tvRating.text = "Rank #${data.animeDto.ratingRank}"
                    tvPopularity.text = "Rank #${data.animeDto.popularityRank}"
                    if (args.videoId != null) {
                        btnYoutubeVideo.isVisible = true
                    }


                }


            }


        }, error = { Log.e("tag", it) }
        )
    }

    private fun openYoutubeAnimeTrailer() {
        binding.btnYoutubeVideo.setOnClickListener {
            this.startActivity(
                Intent(
                    Intent.ACTION_VIEW,
                    Uri.parse("vnd.youtube:${args.videoId}")
                )
            )
        }
    }
}


