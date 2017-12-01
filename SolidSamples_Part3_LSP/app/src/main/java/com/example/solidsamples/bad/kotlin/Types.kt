package com.example.solidsamples.bad.kotlin


/**
 * Created by pieter.snyman on 11/13/17.
 */

class Square(size : Double) : Rectangle(size, size) {
    override val area: Double
        get() {
            return width * height
        }
}

open class Rectangle(var width: Double, var height: Double) {
    open val area: Double
        get() {
            return width * height
        }
}

