package com.saitawngpha.movienoshareui.util

import kotlinx.coroutines.CoroutineDispatcher

/**
 * @Author: ၸၢႆးတွင်ႉၾႃႉ
 * @Date: 11/04/2024.
 */

internal interface Dispatcher {
    val io: CoroutineDispatcher
}

internal expect fun provideDispatcher(): Dispatcher