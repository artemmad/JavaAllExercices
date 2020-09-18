package ru.mirea.exercise6;

public class MovableRectangle extends Rectangle implements Movable {
    public MovableRectangle(Point rightTop, Point leftBottom) {
        super(rightTop, leftBottom);
    }

    @Override
    public void move(int x, int y) {
        try {
            ((PointMovable) getLeftBottom()).move(x, y);
            ((PointMovable) getRightTop()).move(x, y);
        }
        catch (Exception e){
            getLeftBottom().x += x;
            getRightTop().x+= x;
            getLeftBottom().y += y;
            getRightTop().y+= y;
        }
    }
}