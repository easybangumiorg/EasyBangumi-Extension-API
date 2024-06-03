package com.heyanle.extension_api.client

/**
 * Created by heyanle on 2024/6/3.
 * https://github.com/heyanLE
 */
interface NativeLoadClient {

    fun load(path: String){
        System.load(path)
    }

}