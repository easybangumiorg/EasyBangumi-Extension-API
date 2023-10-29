package com.heyanle.easybangumi4.source_api.utils.api

import okhttp3.CacheControl
import okhttp3.OkHttpClient

/**
 * Created by HeYanLe on 2023/10/19 0:25.
 * https://github.com/heyanLE
 */
interface OkhttpHelper {

    val defaultCacheControl: CacheControl

    /**
     * 普通 client
     */
    val client: OkHttpClient

    /**
     * 静默过 cf 盾的 client
     */
    val cloudflareClient: OkHttpClient

    /**
     * 弹出新页面过 cf 盾的 client
     */
    val cloudflareWebViewClient: OkHttpClient
}