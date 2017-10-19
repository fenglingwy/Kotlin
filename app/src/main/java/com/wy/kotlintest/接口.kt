package com.wy.kotlintest

/**
 * Created by Administrator on 2017/10/17 0017.
 */
interface Animal {
    var name: String

    fun run() {
        println("run --> $name")
    }
}

class Cat : Animal {
    override var name: String = "cat"

    override fun run() {
        println("run --> $name")
    }
}

fun main(args: Array<String>) {
    run(Cat())
}

fun run(a: Animal) {
    a.run()
}