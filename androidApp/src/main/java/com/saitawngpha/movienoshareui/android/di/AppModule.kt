package com.saitawngpha.movienoshareui.android.di

import com.saitawngpha.movienoshareui.android.detail.DetailViewModel
import com.saitawngpha.movienoshareui.android.home.HomeViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

/**
 * @Author: ၸၢႆးတွင်ႉၾႃႉ
 * @Date: 12/04/2024.
 */

val appModule = module {
    viewModel { HomeViewModel(get()) }
    viewModel { DetailViewModel(get(), get()) }
}


