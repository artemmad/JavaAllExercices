package ru.mirea.exercies8;

public class Circle extends Shape {
    protected double radius;
    Circle(){}
    Circle(double radius){}
    Circle(double radius, String color, boolean filled){}

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


    public double getArea(){
        return Math.PI;
    }

    public double getPerimeter(){
        return Math.PI;
    }

    public String toString(){
        return "String";
    }
}
