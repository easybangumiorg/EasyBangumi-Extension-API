package com.heyanle.easybangumi4.source_api_v2.component

import com.heyanle.easybangumi4.source_api_v2.Source

/**
 * Created by HeYanLe on 2023/10/29 21:44.
 * https://github.com/heyanLE
 */
open class ComponentWrapper() : Component {

    lateinit var innerSource: Source

    override val source: Source
        get() = innerSource
}
