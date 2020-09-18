package ru.mirea.exercise5;

public class MovablePoint extends Point implements Movable {

    public MovablePoint(int x, int y) {
        super(x, y);
    }

    @Override
    public void move(int x, int y) {
        this.setX(getX()+x);
        this.setY(getY()+y);
    }
}