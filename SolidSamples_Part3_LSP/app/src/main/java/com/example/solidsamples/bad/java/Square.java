package com.example.solidsamples.bad.java;

/**
 * Created by pieter.snyman on 11/13/17.
 */

public class Square extends Rectangle
{

    public Square(final double size) {
        super(size, size);
    }

    @Override
    public void setWidth(final double value) {
        super.setWidth(value);
        super.setHeight(value);
    }

    @Override
    public void setHeight(final double value) {
        super.setHeight(value);
        super.setWidth(value);
    }


}