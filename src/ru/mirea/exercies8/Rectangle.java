package ru.mirea.exercies8;

public class Rectangle  extends Shape{
    protected  double width;
    protected double lenght;
    public Rectangle(){

    }
    public Rectangle(double width, double lenght) {
    }
    public Rectangle(double width, double lenght, String color, boolean filled){

    }
    public double getWidth(){
        return  width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
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
        return "Rectangle{" +
                "width=" + width +
                ", lenght=" + lenght +
                '}';
    }
}
