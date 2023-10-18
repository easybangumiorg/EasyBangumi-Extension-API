package com.heyanle.easybangumi4.source_api

import org.koin.core.module.Module

/**
 * Created by HeYanLe on 2023/10/18 22:41.
 * https://github.com/heyanLE
 */
interface Source {
    /**
     * Must be unique
     */
    val key: String

    val label: String

    val version: String

    val versionCode: Int

    val describe: String?

    /**
     * 注册实体
     * 将实体进行注册，一般使用 single 注册单例实体。
     * 实体间一般使用构造函数注入，调用 get 会自动按照构造函数类型从本源作用域中获取对象
     * 宿主会首先注册 Source 对象本身以及相关工具类实体，同时也可以注册在这里注册的其他 Component 对象或者实体
     * 注意不能有循环依赖，比如 A 的构造函数需要注入 B，B 的构造函数需要注入 A
     * example:
     *  class XSource(): Source{
     *      override fun module(): Module = module {
     *          single {
     *              // 注册首页 Component 对象，最终会在首页展示
     *              XXPageComponent(get(), get())
     *          }
     *
     *          single {
     *              // 注册搜索 Component 对象，最终会在搜索页展示
     *              XXSearchComponent(get(), get())
     *          }
     *      }
     *  }
     *  class XXPageComponent(
     *      // 注入 source 对象本身
     *      private val source: XSource,
     *      // 注入工具类
     *      private val networkHelper: NetworkHelper,
     *  ): PageComponent {
     *      // 插件相关实现，可以直接调用注入的 source 和 networkHelper
     *  }
     */
    fun module(): Module

}