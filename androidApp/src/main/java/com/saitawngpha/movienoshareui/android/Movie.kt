package com.saitawngpha.movienoshareui.android

import android.app.Application
import com.saitawngpha.movienoshareui.android.di.appModule
import com.saitawngpha.movienoshareui.di.getSharedModules
import org.koin.core.context.startKoin

/**
 * @Author: ၸၢႆးတွင်ႉၾႃႉ
 * @Date: 12/04/2024.
 */
class Movie: Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            modules(appModule + getSharedModules())
        }
    }
}