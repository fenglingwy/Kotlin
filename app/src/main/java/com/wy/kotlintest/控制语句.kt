package com.wy.kotlintest

/**
 * Created by Administrator on 2017/10/16 0016.
 */
fun main(args: Array<String>) {
    //    if的分⽀可以是代码块，最后的表达式作为该块的值：
    val a = 10
    val b = 20
    val max = if (a > b) {
        print("Choose a")
        a
    } else {
        print("Choose b")
        b
    }
    println(max)

    //when语句想当与Java中switch
    var x = 2
    when (x) {
        1 -> println("x == 1")
        2 -> println("x == 2")
        else -> { // 注意这个块
            print("x is neither 1 nor 2")
        }
    }

    //for
    var array = arrayOf(1, 2, 3, 4)
    for (i in array.indices) {
        println(array[i])
    }

    //downTo
    for (i in 10 downTo 1 step 2) {
        println("downTo-->" + i)
    }

    for (i in 1 until 10) {
        println("until-->" + i)
    }

    //break
    loop@ for (i in 1..100) {
        for (j in 1..100) {
            if (j == 2) break@loop
            println("break-->" + j)
        }
    }

    //return
    foo()


}

fun foo() {
    var array = arrayOf(0, 1, 2, 3, 4)
    array.forEach it@ {
        if (it == 1) return@it
        print(it)
    }
}