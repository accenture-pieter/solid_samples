package com.example.solidsamples.good.kotlin

/**
 * Created by pieter.snyman on 11/13/17.
 */
class AreaCalculator {

    fun area(shapes: Array<Shape>): Double = shapes.map { it.area }.sum()
}
