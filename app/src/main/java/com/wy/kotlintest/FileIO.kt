package com.wy.kotlintest

import java.io.File

/**
 * Created by Administrator on 2017/10/17 0017.
 */

fun main(args: Array<String>) {
    val file = File("D:\\MJOS")
    val fileTreeWalk = file.walk()
    println(fileTreeWalk.joinToString ( separator = ", ",prefix = "{",postfix = "}"))
}