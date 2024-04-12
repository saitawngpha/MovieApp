package com.saitawngpha.movienoshareui.domain.repository

import com.saitawngpha.movienoshareui.domain.model.Movie

/**
 * @Author: ၸၢႆးတွင်ႉၾႃႉ
 * @Date: 11/04/2024.
 */
internal interface MovieRepository {

    suspend fun getMovies(page: Int): List<Movie>

    suspend fun getMovie(movieId: Int): Movie
}