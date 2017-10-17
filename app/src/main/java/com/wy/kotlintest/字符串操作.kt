package com.wy.kotlintest

/**
 * Created by Administrator on 2017/10/16 0016.
 */
fun main(args: Array<String>) {
    var str = "Hello World!!!"
    var str1 = "0123456789"


    println(str.replace("hello","你好", true))       //替换  replace
    println(str.indexOf("l"))                        //查找字符串
    println(str1.substring(3,9))                     //截取字符串
    println(str.split(" "))                         //字符串分割
    println(str1.sumBy {it.toInt()-'0'.toInt()})    //求和

    //正则
    println(str.matches(regex = Regex(".+")))
}