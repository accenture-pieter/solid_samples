package com.example.solidsamples.good.java;

/**
 * Created by pieter.snyman on 11/13/17.
 */

public class Square implements Shape {

    private final double width;
    private final double height;

    public Square(final double width, final double height) {

        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }
}
