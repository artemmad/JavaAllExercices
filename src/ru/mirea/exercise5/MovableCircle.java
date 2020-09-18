package ru.mirea.exercise5;

public class MovableCircle extends Circle implements Movable {

    public MovableCircle(Point center, double radius) {super(center, radius);}

    @Override
    public void move(int x, int y) {

        try{
        ((MovablePoint)getCenter()).move(x,y);}
        catch (Exception e){
            getCenter().setY(getCenter().getY()+y);
            getCenter().setX(getCenter().getX()+x);
        }
    }
}
