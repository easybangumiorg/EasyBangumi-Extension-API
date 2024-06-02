package com.heyanle.easybangumi4.source_api.utils.api

/**
 * Created by heyanle on 2024/6/2.
 * https://github.com/heyanLE
 */
lateinit var nativeHelper: NativeHelper
interface NativeHelper {

    // 最终会加载 path/[ABI]/lib[libName].so 的文件
    fun tryLoad(path: String, libName: String): Boolean

}