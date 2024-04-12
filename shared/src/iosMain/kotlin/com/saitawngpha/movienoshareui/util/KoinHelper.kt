package com.saitawngpha.movienoshareui.util

import com.saitawngpha.movienoshareui.di.getSharedModules
import org.koin.core.context.startKoin

/**
 * @Author: ၸၢႆးတွင်ႉၾႃႉ
 * @Date: 12/04/2024.
 */

fun initKoin() {
    startKoin {
        modules(getSharedModules())
    }
}