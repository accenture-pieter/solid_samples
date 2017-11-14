package com.example.solidsamples.good.java;

/**
 * Created by pieter.snyman on 11/13/17.
 */

public class Circle implements Shape {

    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }
}
