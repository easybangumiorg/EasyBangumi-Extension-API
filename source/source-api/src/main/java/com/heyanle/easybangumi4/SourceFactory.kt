package com.heyanle.easybangumi4

import com.heyanle.easybangumi4.source_api_v2.Source

/**
 * Created by HeYanLe on 2023/10/18 22:39.
 * https://github.com/heyanLE
 */
interface SourceFactory {

    fun create(): List<Source>

}