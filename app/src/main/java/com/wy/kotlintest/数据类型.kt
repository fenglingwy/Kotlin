package com.wy.kotlintest

/**
 * Created by Administrator on 2017/10/16 0016.
 */
fun main(args: Array<String>) {

    /**
     * 基本数据类型
     * Double 	64
     * Float	32
     * Long	    64
     * Int	    32
     * Short	16
     * Byte	    8
     */
    var byte:Byte = 100
    var float:Float = byte.toFloat()
    var long:Long = byte.toLong()
    var int:Int = byte.toInt()
    var short:Short = byte.toShort()

    println("""
        |Byte —> $byte
        |Float -> $float
        |Long -> $long
        |Int -> $int
        |Short -> $short
        """.trimMargin())

}