package com.example.youtubehwmth6.core.di

import com.example.youtubehwmth6.core.network.networkModule

val koinModules = listOf(
    networkModule,
    repositoryModules,
    viewModules,
    remoteDataSource
)