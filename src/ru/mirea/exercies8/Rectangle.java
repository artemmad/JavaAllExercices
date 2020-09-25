package ru.mirea.exercies8;

public class Rectangle extends Shape {
    protected double width;
    protected double length;

    Rectangle(double width, double length){
        setLength(length);
        setWidth(width);
    }

    Rectangle(double width, double length, String color,boolean filled){
        super(color, filled);
        setWidth(width);
        setLength(length);
    }

    Rectangle(){}

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }


    public double getArea() {
        return width*length;
    }


    public double getPerimeter() {
        return 2*(width+length);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                '}';
    }
}
