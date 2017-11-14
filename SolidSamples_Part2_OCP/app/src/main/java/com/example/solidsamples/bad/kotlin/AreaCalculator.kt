package com.example.solidsamples.bad.kotlin

/**
 * Created by pieter.snyman on 11/13/17.
 */

class AreaCalculator {

    fun area(shapes: Array<Any>): Double {
        var area = 0.0

        shapes.forEach {
            when (it) {
                is Square -> {
                    area += it.width * it.height
                }
                is Circle -> {
                    area += it.radius * it.radius * Math.PI
                }
            }
        }

        return area
    }
}
