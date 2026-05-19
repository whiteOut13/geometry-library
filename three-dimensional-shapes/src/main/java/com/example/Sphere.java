package com.example;

public class Sphere implements Figure {

    private final double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.pow(radius, 2) * 4 * Math.PI;
    }

    @Override
    public double calculatePerimeter() {
        // У сферы нет сторон, рассчитать периметр не получится, обычно рассчитывают экватор
        return 2 * Math.PI * radius;
    }

}
