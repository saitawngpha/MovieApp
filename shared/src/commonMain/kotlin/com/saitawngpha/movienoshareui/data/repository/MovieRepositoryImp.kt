package com.saitawngpha.movienoshareui.data.repository

import com.saitawngpha.movienoshareui.data.remote.RemoteDataSource
import com.saitawngpha.movienoshareui.data.util.toMovie
import com.saitawngpha.movienoshareui.domain.model.Movie
import com.saitawngpha.movienoshareui.domain.repository.MovieRepository

/**
 * @Author: ၸၢႆးတွင်ႉၾႃႉ
 * @Date: 12/04/2024.
 */
internal class MovieRepositoryImp(
    private val remoteDataSource: RemoteDataSource
): MovieRepository {
    override suspend fun getMovies(page: Int): List<Movie> {
        return remoteDataSource.getMovies(page = page).results.map {
            it.toMovie()
        }
    }

    override suspend fun getMovie(movieId: Int): Movie {
        return remoteDataSource.getMovie(movieId = movieId).toMovie()
    }

}