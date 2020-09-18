package com.company.task6;



public class Movable6Rectangle extends Rectangle implements Movable6 {
    public Movable6Rectangle(Point6 rightTop, Point6 leftBottom) {
        super(rightTop, leftBottom);
    }

    @Override
    public void move(int x, int y) {
        try {
            ((Point6Movable6) getLeftBottom()).move(x, y);
            ((Point6Movable6) getRightTop()).move(x, y);
        }
        catch (Exception e){
            getLeftBottom().x += x;
            getRightTop().x+= x;
            getLeftBottom().y += y;
            getRightTop().y+= y;
        }
    }
}
