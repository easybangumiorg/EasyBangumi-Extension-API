package com.heyanle.easybangumi4.source_api.entity

import androidx.annotation.Keep

/**
 * Created by HeYanLe on 2023/2/18 21:54.
 * https://github.com/heyanLE
 */
@Keep
open class PlayLine(
    val id: String, // 源自己维护和判断
    val label: String,
    val episode: ArrayList<Episode>,
)

@Keep
open class Episode(
    val id: String, // 源自己维护和判断
    val label: String,
    val order: Int, // 第几集，用来排序，都一致就按照 PlayLine 中顺序
)


