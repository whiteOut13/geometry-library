package com.example;

public class Cube implements Figure {

    private final double length;

    public Cube(double length) {
        this.length = length;
    }

    @Override
    public double calculateArea() {
        return 6 * Math.pow(length, 2);
    }

    @Override
    public double calculatePerimeter() {
        return 12 * length;
    }

}
