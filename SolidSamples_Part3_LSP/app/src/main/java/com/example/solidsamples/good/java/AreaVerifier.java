package com.example.solidsamples.good.java;

/**
 * Created by pieter.snyman on 11/13/17.
 */

public class AreaVerifier {

    void tester() throws Exception {
        verify(new Rectangle(5.0, 4.0));
        //Can't break this rule anymore
        verify(new Square(5.0));
    }

    boolean verify(Rectangle rectangle) throws Exception {
        rectangle.setWidth(5.0);
        rectangle.setHeight(4.0);

        if(rectangle.getArea() != 20.0) {
            throw new Exception("5 x 4 = 20 expected for Rectangle");
        }

        return true;
    }

    boolean verify(Square square) throws Exception {
        square.setSize(5.0);

        if(square.getArea() != 25.0) {
            throw new Exception("5 x 5 = 25 expected for Square");
        }

        return true;
    }
}
