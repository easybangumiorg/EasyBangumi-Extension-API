package com.heyanle.extension_api

/**
 * Created by heyanle on 2024/6/2.
 * https://github.com/heyanLE
 */
class NativeLoadService {

    companion object {
        @JvmStatic
        fun load(path: String){
            System.load(path)
        }
    }



}