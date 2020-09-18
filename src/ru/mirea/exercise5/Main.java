package ru.mirea.exercise5;

public class Main {

    public static void main(String[] args) {

        Circle circle = new Circle(new Point(1,1), 10f);

        System.out.println(circle);

        PointMovable pointMovable = new PointMovable(10,10);
        System.out.println(pointMovable);
        pointMovable.move(12,19);
        System.out.println(pointMovable);

        Point point = new PointMovable(6,5);
        System.out.println(point);
        Circle circle3 = new CircleMovable(new PointMovable(4,3),7.6f);
        System.out.println(circle3);
    }
}
