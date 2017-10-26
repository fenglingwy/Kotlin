package com.wy.kotlintest.cor

import java.net.URL
import kotlin.coroutines.experimental.*

/**
 * Created by Administrator on 2017/10/26 0026.
 */
fun main(args: Array<String>) {
    coroutine {
        val data = getData("https://www.baidu.com/")
        println("coroutine:"+ Thread.currentThread().name)
        println("111111111111"+data)

    }
    print("11111:"+ Thread.currentThread().name)
}

fun coroutine(block: suspend () -> Unit) {
    block.startCoroutine(BaseContinuation())
}

suspend fun getData(url: String) = suspendCoroutine<String> { continuation ->
    Thread {
        run {
            val readText = URL(url).readText()
            continuation.resume(readText)
        }
    }.start()
    "data"
}

class  BaseContinuation<T> : Continuation<T> {
    override val context: CoroutineContext = EmptyCoroutineContext

    override fun resume(value: T) {
        println("resume:"+ Thread.currentThread().name)
        println(value is String)
    }

    override fun resumeWithException(exception: Throwable) {

    }

}