package ru.mirea.exercise5;

public class
PointMovable extends Point implements Movable {


    public PointMovable(int x, int y) {
        super(x, y);
    }


    @Override
    public void move(int x, int y) {
        this.setX(getX()+x);
        this.setY(getY()+y);
    }
}
