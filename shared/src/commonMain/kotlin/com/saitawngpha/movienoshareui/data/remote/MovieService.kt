package com.saitawngpha.movienoshareui.data.remote

import io.ktor.client.call.*
import io.ktor.client.request.*

/**
 * @Author: ၸၢႆးတွင်ႉၾႃႉ
 * @Date: 11/04/2024.
 */
internal class MovieService: KtorApi(){
    suspend fun getMovies(page: Int = 1): MovieResponse = client.get {
        pathUrl("movie/popular")
        parameter("page", page)
    }.body()

    suspend fun getMovie(movieId: Int): MovieRemote = client.get {
        pathUrl("movie/${movieId}")
    }.body()
}