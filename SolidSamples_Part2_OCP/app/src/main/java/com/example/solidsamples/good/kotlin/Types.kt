package com.example.solidsamples.good.kotlin

/**
 * Created by pieter.snyman on 11/13/17.
 */
interface Shape {
    val area: Double
}

class Circle(private val radius: Double) : Shape {
    override val area: Double
        get() = radius * radius * Math.PI
}

class Square(private val width: Double, private val height: Double) : Shape {
    override val area: Double
        get() = width * height
}