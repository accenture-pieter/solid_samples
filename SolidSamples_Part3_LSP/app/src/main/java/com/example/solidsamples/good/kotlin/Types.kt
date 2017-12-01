package com.example.solidsamples.good.kotlin

/**
 * Created by pieter.snyman on 11/13/17.
 */
interface Shape {
    val area: Double
}

class Rectangle(var width: Double, var height: Double) : Shape {
    override val area: Double
        get() {
            return width * height
        }
}


class Square(var size: Double) : Shape {
    override val area: Double
        get() {
            return size * size
        }
}