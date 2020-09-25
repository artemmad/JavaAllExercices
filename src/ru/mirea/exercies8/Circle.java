package ru.mirea.exercies8;

public class Circle extends Shape{
    protected double radius;
    public Circle(){

    }
    public Circle(double radius){

    }
    public Circle(double radius, String color, boolean filled){

    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return super.getArea();
    }

    @Override
    public double getPerimeter() {
        return super.getPerimeter();
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
