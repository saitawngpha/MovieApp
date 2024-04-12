package com.saitawngpha.movienoshareui.data.util

import com.saitawngpha.movienoshareui.data.remote.MovieRemote
import com.saitawngpha.movienoshareui.domain.model.Movie

/**
 * @Author: ၸၢႆးတွင်ႉၾႃႉ
 * @Date: 11/04/2024.
 */
internal fun MovieRemote.toMovie(): Movie {
    return Movie(
        id = id,
        title = title,
        description = overview,
        imageUrl = getImageUrl(posterImage),
        releaseDate = releaseDate
    )
}

private fun getImageUrl(posterImage: String) = "https://image.tmdb.org/t/p/w500/$posterImage"