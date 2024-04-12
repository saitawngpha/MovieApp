package com.saitawngpha.movienoshareui.domain.usecase

import com.saitawngpha.movienoshareui.domain.model.Movie
import com.saitawngpha.movienoshareui.domain.repository.MovieRepository
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject

/**
 * @Author: ၸၢႆးတွင်ႉၾႃႉ
 * @Date: 12/04/2024.
 */
class GetMoviesUseCase: KoinComponent {
    private val repository: MovieRepository by inject()

    @Throws(Exception::class)
    suspend operator fun invoke(page: Int): List<Movie> {
        return repository.getMovies(page = page)
    }
}