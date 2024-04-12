package com.saitawngpha.movienoshareui.domain.usecase

import com.saitawngpha.movienoshareui.domain.model.Movie
import com.saitawngpha.movienoshareui.domain.repository.MovieRepository
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject

/**
 * @Author: ၸၢႆးတွင်ႉၾႃႉ
 * @Date: 12/04/2024.
 */
class GetMovieUseCase: KoinComponent {
    private val repository: MovieRepository by inject()

    suspend operator fun invoke(movieId: Int): Movie {
        return repository.getMovie(movieId = movieId)
    }
}