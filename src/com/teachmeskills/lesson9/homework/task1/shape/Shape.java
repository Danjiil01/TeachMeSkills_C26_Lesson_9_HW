package com.teachmeskills.lesson9.homework.task1.shape;

public abstract sealed class Shape permits Rectangle, Circle, Triangle {
    public abstract double calculateArea(); //абстрактный метод для расчета площади
    public abstract double calculatePerimeter(); //абстрактный метод для расчета периметра
}
