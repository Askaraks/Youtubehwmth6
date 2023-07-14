package com.example.youtubehwmth6.core.di

import com.example.youtubehwmth6.ui.detail.DetailViewModel
import com.example.youtubehwmth6.ui.player.PlayerViewModel
import com.example.youtubehwmth6.ui.playlist.PlaylistViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModules = module {
    viewModel { PlaylistViewModel(get()) }
    viewModel { DetailViewModel(get()) }
    viewModel { PlayerViewModel(get()) }
}