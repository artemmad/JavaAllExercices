package ru.mirea.exercise5;

public class CircleMovable extends Circle implements Movable {


    public CircleMovable(Point center,double radius) {
        super(center,radius);
    }


    @Override
    public void move(int x, int y) {
        center.setX(center.getX()+x);
        center.setY(center.getY()+y);
    }
}
