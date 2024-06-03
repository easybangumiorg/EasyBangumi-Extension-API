package com.heyanle.extension_api

import android.app.Application
import com.heyanle.easybangumi4.source_api.SourceFactory
import com.heyanle.extension_api.client.NativeLoadClient

/**
 * Created by heyanle on 2024/6/2.
 * https://github.com/heyanLE
 */
abstract class Extension : SourceFactory, NativeLoadClient {

    var bundle: ExtensionBundle? = null

    // 可能会多次调用，如果需要加载 so 包记得加 try catch
    open fun onInit(
        application: Application,
    ){
    }

    open fun onDestroy(){}


}