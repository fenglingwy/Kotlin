package com.wy.kotlintest

/**
 * Created by Administrator on 2017/10/17 0017.
 */

interface Image{
    var name:String
    fun display()
}

class RealImage(override var name: String) :Image{
    override fun display() {
        println("RealImage-->$name")
    }
}

class proxyImage(var image : Image) :Image by image{
    override fun display() {
        println("RealImage-->前")
        image.display()
        println("RealImage-->后")
    }
}

fun main(args: Array<String>) {
    var image = proxyImage(RealImage("RealImage"))
    image.display()
}