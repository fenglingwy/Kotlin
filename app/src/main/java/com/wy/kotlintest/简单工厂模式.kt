package com.wy.kotlintest

/**
 * Created by Administrator on 2017/10/17 0017.
 */
abstract class Product {
    abstract fun print()
}

class ConcreteProductA : Product() {
    override fun print() {
        println("print of ConcreteProductA")
    }
}

class ConcreteProductB : Product() {
    override fun print() {
        println("print of ConcreteProductB")
    }
}

class Factory {
    fun createProduct(tag: String): Product? {
        var product: Product? = null
        when (tag) {
            "A" -> {
                product = ConcreteProductA()
                println("create ProductA")
            }
            "B" -> {
                product = ConcreteProductB()
                println("create ProductB")
            }
            else -> {
            }
        }
        return product
    }
}

fun main(args: Array<String>) {
    val factory = Factory()
    var product: Product? = factory.createProduct("A")
    if (product != null) {
        product.print()
    }
    product = factory.createProduct("B")
    if (product != null) {
        product.print()
    }
    product = factory.createProduct("C")
    if (product != null) {
        product.print()
    }
}