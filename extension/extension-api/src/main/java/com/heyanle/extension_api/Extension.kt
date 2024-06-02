package com.heyanle.extension_api

import android.app.Application
import com.heyanle.easybangumi4.source_api.SourceFactory

/**
 * Created by heyanle on 2024/6/2.
 * https://github.com/heyanLE
 */
interface Extension : SourceFactory {

    // 可能会多次调用，如果需要加载 so 包记得加 try catch
    fun onInit(
        application: Application,
        path: String
    ){}

    fun onDestroy(){}

}