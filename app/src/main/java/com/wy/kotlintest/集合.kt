package com.wy.kotlintest

/**
 * Created by Administrator on 2017/10/17 0017.
 */


fun main(args: Array<String>) {
    //只读 mapOf
    var onlyReadMap = mapOf("name" to "令狐")
    val mutableMap = onlyReadMap.toMutableMap()

    //可变MutableMap
    mutableMap.put("age","25")

    for((k,v) in mutableMap){
        println("$k  $v")
    }

    //只读 listOf
    var onlyReadList = listOf(1,2,4,5,6)
    val mutableList = onlyReadList.toMutableList()

    //遍历
    for (i in mutableList.indices) {
        print(mutableList[i])
    }
    for ((index, value) in mutableList.withIndex()) {
        println("the element at $index is $value")
    }

    //HashMap
    var hashMap = HashMap<String, String>()
    hashMap.put("name", "柯洁")
    hashMap.put("age", "25")

    val arr = arrayOf(1, 3, 2, 4, 5)
    arr.set(2,10)
    arr.forEach {
        println(it)
    }

}



