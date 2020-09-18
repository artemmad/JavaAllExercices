package ru.mirea.exercise6;


public class
MovableRectangle extends Rectangle implements Movable {
    public MovableRectangle(Point x, Point y) {
        super(x, y);
    }


    public void move(int x, int y) {
        try {
            ((PointMovable)getX()).move(5,8);
            ((PointMovable)getY()).move(5,8);
        }
        catch (Exception e){
            getX().x += x;
            getX().x += x;
            getY().y += y;
            getY().y += y;
        }
    }

}
