package com.example.solidsamples.bad.java;

/**
 * Created by pieter.snyman on 11/13/17.
 */

public class AreaCalculator {

    public double area(Object[] shapes) {
        double area = 0;
        for (Object shape : shapes) {
            if (shape instanceof Square) {
                Square square = (Square) shape;
                area += square.getWidth() * square.getHeight();
            } else {
                Circle circle = (Circle) shape;
                area += circle.getRadius() * circle.getRadius() * Math.PI;
            }
        }

        return area;
    }
}
