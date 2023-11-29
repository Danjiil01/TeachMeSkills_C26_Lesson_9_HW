package com.teachmeskills.lesson9.homework.task1;

import com.teachmeskills.lesson9.homework.task1.shape.Circle;
import com.teachmeskills.lesson9.homework.task1.shape.Rectangle;
import com.teachmeskills.lesson9.homework.task1.shape.Triangle;
import com.teachmeskills.lesson9.homework.task1.shape.Shape;

public class ShapeRunner {
    public static void main(String[] args) {

        Shape[] shapes = new Shape [5];
        shapes[0] = new Triangle(3, 4, 5);
        shapes[1] = new Circle(5);
        shapes[2] = new Rectangle(8, 7);
        shapes[3] = new Circle(10);
        shapes[4] = new Rectangle(18, 22);

        double totalPerimeter = 0;

        for (Shape shape : shapes){
            System.out.println("Shape`s area is " + shape.calculateArea());
            System.out.println("Shape`s perimeter is " + shape.calculatePerimeter());
            System.out.println();
            totalPerimeter += shape.calculatePerimeter();
        }

        System.out.println();

        System.out.println("Overall sum of perimeters equals to " + totalPerimeter);
    }
}
