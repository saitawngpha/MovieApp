package com.saitawngpha.movienoshareui.di

import com.saitawngpha.movienoshareui.data.remote.MovieService
import com.saitawngpha.movienoshareui.data.remote.RemoteDataSource
import com.saitawngpha.movienoshareui.data.repository.MovieRepositoryImp
import com.saitawngpha.movienoshareui.domain.repository.MovieRepository
import com.saitawngpha.movienoshareui.domain.usecase.GetMovieUseCase
import com.saitawngpha.movienoshareui.domain.usecase.GetMoviesUseCase
import com.saitawngpha.movienoshareui.util.provideDispatcher
import org.koin.dsl.module

/**
 * @Author: ၸၢႆးတွင်ႉၾႃႉ
 * @Date: 12/04/2024.
 */

private val dataModule = module {
    factory { RemoteDataSource(get(), get()) }
    factory { MovieService() }
}

private val utilityModule = module {
    factory { provideDispatcher() }
}

private val domainModule = module {
    single<MovieRepository> { MovieRepositoryImp(get()) }
    factory { GetMoviesUseCase() }
    factory { GetMovieUseCase() }
}

private val sharedModules = listOf(domainModule, utilityModule, dataModule)

fun getSharedModules() = sharedModules