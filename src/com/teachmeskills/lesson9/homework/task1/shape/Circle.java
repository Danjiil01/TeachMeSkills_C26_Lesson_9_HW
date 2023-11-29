package com.teachmeskills.lesson9.homework.task1.shape;

public final class Circle extends Shape{
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius,2);
    }

    @Override
    public double calculatePerimeter() {
        return Math.PI * radius * 2;
    }
}
