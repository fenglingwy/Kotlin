package com.wy.kotlintest

open class Shape(val color: String) {
    open var width = 20
        get() = field + 1
        set(value) {
            field = value + 1
        }

    var height = 20

    init {
        //主构造函数初始代码块
        //println("Shape initialized with color $color")
    }

    constructor(width: Int, height: Int, color: String) : this(color) {
        this.height = height
        this.width = width
    }

    open fun draw() {
        println("Shape($width,$height) $color")
    }

    fun draw1() {
        println("draw1")
    }
}

class Circle(color: String) : Shape(color) {

    override var width: Int
        get() = super.width
        set(value) {}

    override fun draw() {
        println("Circle($width,$height) $color")
    }
}

class Paint(var s: Shape) {
    fun draw() {
        s.draw()
    }
}

fun main(args: Array<String>) {
    var shape = Shape(30, 30, "红色")
    shape.draw()

    var circle = Circle("蓝色")
    circle.draw()
    circle.draw1()

    var paint = Paint(Circle("紫色"))
    paint.draw()

    var str1 = "111"
    var str2 = str1
    str1 += "2"
    println("$str1  $str2 ")
}