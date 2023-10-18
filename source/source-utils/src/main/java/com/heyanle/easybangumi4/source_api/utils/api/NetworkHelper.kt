package com.heyanle.easybangumi4.source_api.utils.api

import android.webkit.WebView
import com.heyanle.easybangumi4.source_api.utils.core.network.AndroidCookieJar
import okhttp3.OkHttpClient

/**
 * Created by HeYanLe on 2023/10/18 23:51.
 * https://github.com/heyanLE
 */
interface NetworkHelper {

    val cookieManager: AndroidCookieJar
    val defaultLinuxUA: String
    val defaultAndroidUA: String
    val randomUA: String

}