package com.wy.kotlintest

import java.io.*

/**
 * Created by Administrator on 2017/10/17 0017.
 */

fun main(args: Array<String>) {
    val file = File("D:\\MJOS")

    //文件树
    val fileTreeWalk = file.walk()
    println(fileTreeWalk.joinToString(separator = ", ", prefix = "{", postfix = "}"))

    val f = File("C:\\Users\\Administrator\\Desktop\\Hello.txt")

    //读取全部内容
    println("readText-->  \n" + f.readText())

    //按行读返回 List<String>
    println("readLines-->  \n" + f.readLines())

    //读取为bytes数组
    val bytes: ByteArray = f.readBytes()
    println("readBytes-->  \n" + bytes.joinToString(separator = ""))


    val reader: Reader = f.reader()
    val bufferedReader: BufferedReader = f.bufferedReader()


    val inputStream: InputStream = f.inputStream()
    var count: Int
    var arr = ByteArray(1)
    var bos = ByteArrayOutputStream()
    while (true) {
        count = inputStream.read(arr)
        if (count == -1) break
        bos.write(arr,0,count)
    }
    println("InputStream-->\n"+ bos.toString())





    var file2 = File("F:\\KotlinTest\\app\\src\\main\\java\\com\\wy\\kotlintest\\file.txt")
    if (!file2.parentFile.exists()) file2.parentFile.mkdirs()
    file2.writeText("覆盖文本\n")
    file2.writeText("覆盖文本\n")
    file2.appendText("追加文本\n")
    file2.appendText("追加文本\n")

}



