package com.company.task6;

public class Point6Movable6 extends Point6 implements Movable6 {
    public Point6Movable6(int x, int y) {
        super(x, y);
    }

    @Override
    public void move(int x, int y) {
        this.setX(getX()+x);
        this.setY(getY()+y);
    }
}
