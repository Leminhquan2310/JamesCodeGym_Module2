package com.codegym;

public class Main {
    public static void main(String[] args) {
        Shape c1 = new Circle(4);
        Shape c2 = new Circle(6);
        Shape r1 = new Rectangle(5, 10);
        Shape r2 = new Rectangle(8, 20);

        Shape[] shapes = {c1, c2, r1, r2};

        for (Shape shape : shapes) {
            double percent = Math.random() * 100;
            shape.resize(percent);
            System.out.println(shape);
        }
    }
}
