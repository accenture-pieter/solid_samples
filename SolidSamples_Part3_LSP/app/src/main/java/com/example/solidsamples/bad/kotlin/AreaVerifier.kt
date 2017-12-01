package com.example.solidsamples.bad.kotlin

/**
 * Created by pieter.snyman on 11/13/17.
 */

class AreaVerifier {

    fun tester() {
        verify(Rectangle(5.0, 4.0))
        verify(Square(5.0))
    }

    fun verify(rectangle: Rectangle): Boolean {
        //override width and height for testing.
        //Is this assumption correct for all cases?
        rectangle.width = 5.0
        rectangle.height = 4.0

        if(rectangle.area != 20.0) {
            throw Exception("5 x 4 = 20 expected for Rectangle")
        }

        return true
    }
}
