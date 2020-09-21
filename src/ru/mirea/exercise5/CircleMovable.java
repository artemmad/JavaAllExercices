package ru.mirea.exercise5;

public class CircleMovable extends Circle implements Movable {
    public CircleMovable(Point c, double rad) {
        super(c, rad);
    }

    @Override
    public void move(int x, int y) {
        Point center = this.getCenter();
        center.setX(center.getX() + x);
        center.setY(center.getY() + y);
    }
}
