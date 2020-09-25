package ru.mirea.exercise5;

public class Main {

    public static void main(String[] args) {

        Circle circle = new Circle(new Point(1,1), 10f);

        System.out.println(circle);

        PointMovable pointMovable = new PointMovable(10,10);
        System.out.println(pointMovable);
        pointMovable.move(12,19);
        System.out.println(pointMovable);

        Point point = new PointMovable(10,20);
        System.out.println(point);
        CircleMovable circle2  = new CircleMovable(new PointMovable(4,3),4.5f);
        System.out.println(circle2);
        circle2.move(4,6);
        System.out.println(circle2);
    }
}
