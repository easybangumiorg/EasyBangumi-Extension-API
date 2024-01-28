package com.heyanle.easybangumi4.source_api_v2.entity

import androidx.annotation.Keep

/**
 * 总线结构
 * Created by heyanlin on 2024/1/15 11:10.
 */
@Keep
data class Cartoon(
    // unique
    var id: String,              // 标识，由源自己支持，用于区分番剧
    var source: String,

    // cover
    var isCoverLoaded: Boolean,
    var url: String,
    var title: String,
    var genre: String,          // 标签，一般为 "xx, xx"
    var coverUrl: String,
    var intro: String,

    // detailed
    var isDetailedLoaded: Boolean = false,
    var description: String = "",
    var updateStrategy: Int = 0,
    var isUpdate: Boolean = false,       // 是否更新，在追番页显示
    var status: Int = 0,

    // playLine
    var isPlayLineLoaded: Boolean = false,
    var playLine: List<PlayLine> = listOf(),

    // other
    // 源自己可以存储数据
    val mapExt: HashMap<String, String> = hashMapOf()
){


    companion object {
        const val STATUS_UNKNOWN = 0               // 未知
        const val STATUS_ONGOING = 1               // 连载中
        const val STATUS_COMPLETED = 2             // 已完结

        /**
         * 无论严格还是不严格都会更新
         */
        const val UPDATE_STRATEGY_ALWAYS = 0

        /**
         * 只有严格更新时才会更新，一般用于已完结
         */
        const val UPDATE_STRATEGY_ONLY_STRICT = 1

        /**
         * 不更新，一般用于剧场版或年代久远不可能更新的番剧
         */
        const val UPDATE_STRATEGY_NEVER = 2

        fun fromCover(
            // unique
            id: String,              // 标识，由源自己支持，用于区分番剧
            source: String,

            url: String,
            title: String,
            genre: String,          // 标签，一般为 "xx, xx"
            coverUrl: String,
            intro: String,
        ): Cartoon {
            return Cartoon(
                id, source, true, url, title, genre, coverUrl, intro
            )
        }
    }

    val genreList: List<String> by lazy {
        if (genre.isBlank()) emptyList()
        else genre.split(",").map { it.trim() }.filterNot { it.isBlank() }.distinct()
    }


    fun loadDetailed(
        description: String = "",
        updateStrategy: Int = 0,
        isUpdate: Boolean = false,       // 是否更新，在追番页显示
        status: Int = 0,
    ) {
        this.isDetailedLoaded = true
        this.description = description
        this.updateStrategy = updateStrategy
        this.isUpdate = isUpdate
        this.status = status
    }

    fun loadPlayLine(
        playLine: List<PlayLine> = listOf(),
    ) {
        this.isPlayLineLoaded = true
        this.playLine = playLine
    }

}
