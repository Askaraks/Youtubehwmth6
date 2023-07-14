package com.example.youtubehwmth6.core.di

import com.example.youtubehwmth6.core.network.RemoteDataSource
import org.koin.dsl.module

val remoteDataSource = module {
    factory { RemoteDataSource(get()) }
}