package com.saitawngpha.movienoshareui.android.common

import androidx.navigation.NavType
import androidx.navigation.navArgument

/**
 * @Author: ၸၢႆးတွင်ႉၾႃႉ
 * @Date: 12/04/2024.
 */

interface Destination {
    val title: String
    val route: String
    val routeWithArgs: String
}

object Home: Destination {
    override val title: String
        get() = "Movies App"

    override val route: String
        get() = "home"

    override val routeWithArgs: String
        get() = route
}

object Detail: Destination {
    override val title: String
        get() = "Movie details"

    override val route: String
        get() = "detail"

    override val routeWithArgs: String
        get() = "$route/{movieId}"

    val arguments = listOf(
        navArgument(name = "movieId") {
            type = NavType.IntType
        }
    )
}

val movieDestinations = listOf(Home, Detail)