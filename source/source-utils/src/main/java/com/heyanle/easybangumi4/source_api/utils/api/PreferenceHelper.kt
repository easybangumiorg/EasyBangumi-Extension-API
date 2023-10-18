package com.heyanle.easybangumi4.source_api.utils.api

/**
 * 存取 key value 数据
 * Created by HeYanLe on 2023/10/19 0:03.
 * https://github.com/heyanLE
 */
interface PreferenceHelper {

    fun get(key: String, def: String): String

    fun put(key: String, value: String)

}