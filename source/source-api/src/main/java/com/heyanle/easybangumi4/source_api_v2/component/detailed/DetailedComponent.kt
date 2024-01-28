package com.heyanle.easybangumi4.source_api_v2.component.detailed


import com.heyanle.easybangumi4.SourceResult
import com.heyanle.easybangumi4.source_api_v2.component.Component
import com.heyanle.easybangumi4.source_api_v2.entity.Cartoon
import com.heyanle.easybangumi4.source_api_v2.entity.PlayLine

/**
 * Created by HeYanLe on 2023/10/18 23:26.
 * https://github.com/heyanLE
 */
interface DetailedComponent: Component {
    class NonPlayLine(
        playLine: PlayLine
    ): List<PlayLine> by listOf(playLine)

    /**
     * 获取番剧详细信息
     */
    suspend fun getDetailed(
        cartoon: Cartoon
    ): SourceResult<Cartoon>

    /**
     * 获取播放线路
     */
    suspend fun getPlayLine(
        cartoon: Cartoon
    ): SourceResult<List<PlayLine>>

    /**
     * 同时获取
     */
    suspend fun getAll(
        cartoon: Cartoon
    ): SourceResult<Pair<Cartoon, List<PlayLine>>>
}