package ru.mirea.exercise6;


public class Rectangle {
    private Point x;
    private Point y;
    private int a;
    private int b;
    private Point center;
    public Rectangle(Point x, Point y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public Point getX() {
        return x;
    }

    public Point getY() {
        return y;
    }

    public void setA(int a) {
        this.a = a;
    }

    public Point getCenter() {
        return center;
    }

    public void setB(int b) {
        this.b = b;
    }

    public static void S(int a,int b){
        System.out.println("S: " + (a * b));
    }
    public static void P(int a,int b){
        System.out.println("P: " + ((a + b ) * 2 ));
    }
}
