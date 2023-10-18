package com.heyanle.easybangumi4.source_api.component

import org.koin.core.module.Module

/**
 *
 * Created by HeYanLe on 2023/10/18 23:34.
 * https://github.com/heyanLE
 */
interface ModuleComponent: Component {

    /**
     * 嵌套注册实体
     * @see com.heyanle.easybangumi4.source_api.Source.module
     */
    fun module(): Module


}