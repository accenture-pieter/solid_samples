package com.example.solidsamples.good.java;

/**
 * Created by pieter.snyman on 11/13/17.
 */

public class AreaCalculator {

    public double area(Shape[] shapes)
    {
        double area = 0;
        for (Shape shape : shapes) {
            area += shape.getArea();
        }

        return area;
    }
}
