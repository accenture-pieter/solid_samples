package com.example.solidsamples.good.kotlin

/**
 * Created by pieter.snyman on 11/13/17.
 */
class AreaVerifier {

    private fun tester() {
        verify(Rectangle(5.0, 4.0))
        //Can't break this rule anymore
        verify(Square(5.0))
    }

    private fun verify(rectangle: Rectangle): Boolean {
        rectangle.width = 5.0
        rectangle.height = 4.0

        if (rectangle.area != 20.0) {
            throw Exception("5 x 4 = 20 expected for Rectangle")
        }

        return true
    }

    private fun verify(square: Square): Boolean {
        square.size = 5.0

        if (square.area != 25.0) {
            throw Exception("5 x 5 = 25 expected for Square")
        }

        return true
    }
}