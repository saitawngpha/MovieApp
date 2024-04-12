package com.saitawngpha.movienoshareui.data.remote

import kotlinx.serialization.Serializable

/**
 * @Author: ၸၢႆးတွင်ႉၾႃႉ
 * @Date: 11/04/2024.
 */

@Serializable
internal data class MovieResponse(
    val results: List<MovieRemote>
)
