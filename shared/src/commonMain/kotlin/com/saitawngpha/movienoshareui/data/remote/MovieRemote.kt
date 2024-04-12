package com.saitawngpha.movienoshareui.data.remote

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.Serializer

/**
 * @Author: ၸၢႆးတွင်ႉၾႃႉ
 * @Date: 11/04/2024.
 */

@Serializable
internal data class MovieRemote(
    val id: Int,
    val title: String,
    val overview: String,
    @SerialName("poster_path")
    val posterImage: String,
    @SerialName("release_date")
    val releaseDate: String
)
