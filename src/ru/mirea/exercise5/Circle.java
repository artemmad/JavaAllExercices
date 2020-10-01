package ru.mirea.exercise5;

import com.company.task5.Point;

public class Circle {
    private Point center;
    private double radius;
    private String color = "Red";

    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public double getRadius() {
        return radius;
    }



    @Override
    public String toString() {
        return "Circle{" +
                "center=" + center +
                ", radius=" + radius +
                '}';
    }
}
