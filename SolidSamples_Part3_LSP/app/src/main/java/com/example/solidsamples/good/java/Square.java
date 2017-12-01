package com.example.solidsamples.good.java;

/**
 * Created by pieter.snyman on 11/13/17.
 */

public class Square implements Shape {

    private double size;

    public Square(final double size) {

        this.size = size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    @Override
    public double getArea() {
        return size * size;
    }
}
