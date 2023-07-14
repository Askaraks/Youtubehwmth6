package com.example.youtubehwmth6.core.di

import com.example.youtubehwmth6.repository.Repository
import org.koin.dsl.module

val repositoryModules = module {
    single { Repository(get()) }
}