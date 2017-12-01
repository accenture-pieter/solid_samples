package com.example.solidsamples.bad.kotlin


/**
 * Created by pieter.snyman on 11/13/17.
 */

class Square(size: Double) : Rectangle(size, size) {
    override val area: Double
        get() {
            return width * height
        }

    override var height = size
        set(value) {
            field = value
            width = value
        }

    override var width = size
        set(value) {
            field = value
            height = value
        }
}

open class Rectangle(open var width: Double, open var height: Double) {
    open val area: Double
        get() {
            return width * height
        }
}

