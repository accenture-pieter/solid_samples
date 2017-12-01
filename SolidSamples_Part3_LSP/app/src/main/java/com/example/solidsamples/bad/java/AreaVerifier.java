package com.example.solidsamples.bad.java;

/**
 * Created by pieter.snyman on 11/13/17.
 */

public class AreaVerifier {

    void tester() throws Exception {
        verify(new Rectangle(5.0, 4.0));
        verify(new Square(5.0));
    }

    boolean verify(Rectangle rectangle) throws Exception {
        //override width and height for testing.
        //Is this assumption correct for all cases?
        rectangle.setWidth(5.0);
        rectangle.setHeight(4.0);

        if(rectangle.getArea() != 20.0) {
            throw new Exception("5 x 4 = 20 expected for Rectangle");
        }

        return true;
    }
}
