package com.saitawngpha.movienoshareui.util

import com.saitawngpha.movienoshareui.util.Dispatcher
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers

/**
 * @Author: ၸၢႆးတွင်ႉၾႃႉ
 * @Date: 11/04/2024.
 */

internal class iOSDispatcher: Dispatcher {
    override val io: CoroutineDispatcher
        get() = Dispatchers.Default
}

internal actual fun provideDispatcher(): Dispatcher = iOSDispatcher()