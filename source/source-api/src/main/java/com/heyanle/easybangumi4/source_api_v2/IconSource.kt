package com.heyanle.easybangumi4.source_api_v2

import android.graphics.drawable.Drawable
import androidx.annotation.Keep

/**
 * Created by HeYanLe on 2023/2/22 20:12.
 * https://github.com/heyanLE
 */
@Keep
interface IconSource : Source {

    fun getIconFactory(): () -> (Drawable?)

}