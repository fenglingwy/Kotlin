package com.wy.kotlintest

import java.util.*
import kotlin.properties.Delegates

/**
 * Created by Administrator on 2017/10/17 0017.
 */

/**
 * 被观察者接口
 */
interface ISubject {
    //注册观察者
    fun registerObserver(observer: IObserve)

    //移除观察者
    fun removeObserver(observer: IObserve)

    //通知观察者
    fun notifyObservers()
}

/**
 * 观察者接口
 */
interface IObserve {
    fun update()
}

/**
 * 被观察者实现类
 */
internal class SubjectImpl : ISubject {
    var list: MutableList<IObserve> = ArrayList()

    override fun registerObserver(observer: IObserve) {
        list.add(observer)
    }

    override fun removeObserver(observer: IObserve) {
        list.remove(observer)
    }

    override fun notifyObservers() {
        for (item in list) {
            item.update()
        }
    }
}

fun main(args: Array<String>) {

    val sub = SubjectImpl()
    sub.registerObserver(object : IObserve {
        override fun update() {
            println("Observer01 ---> update")
        }
    })
    sub.registerObserver(object : IObserve {
        override fun update() {
            println("Observer02 ---> update")
        }
    })

    var name: String by Delegates.observable("old") {
        prop, old, new -> println("$prop->$old -> $new")

        sub.notifyObservers()
    }

    name = "new"
}



