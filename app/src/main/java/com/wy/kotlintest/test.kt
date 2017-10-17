package com.wy.kotlintest

/**
 * Created by Administrator on 2017/10/17 0017.
 */

 interface test {
    companion object {
        val name: String? = null
    }
}

fun main(args: Array<String>) {
    println()
    test.name
}
