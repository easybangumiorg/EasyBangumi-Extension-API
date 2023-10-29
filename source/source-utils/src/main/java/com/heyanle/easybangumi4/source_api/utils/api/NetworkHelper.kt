package com.heyanle.easybangumi4.source_api.utils.api

import com.heyanle.easybangumi4.source_api.utils.core.network.AndroidCookieJar

/**
 * Created by HeYanLe on 2023/10/18 23:51.
 * https://github.com/heyanLE
 */
interface NetworkHelper {

    /**
     * cookie 全局
     */
    val cookieManager: AndroidCookieJar

    /**
     * 各种 UA
     */
    val defaultLinuxUA: String
    val defaultAndroidUA: String
    val randomUA: String

}