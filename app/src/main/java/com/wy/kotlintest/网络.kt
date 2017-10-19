package com.wy.kotlintest

import java.net.URL

/**
 * Created by Administrator on 2017/10/18 0018.
 */
fun main(args: Array<String>) {
    val res = getUrlContent("https://www.baidu.com/")

    println(res)
}

fun getUrlContent(url: String): String {
    return URL(url).readText()
}