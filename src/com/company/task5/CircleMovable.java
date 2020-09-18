package com.company.task5;

import com.company.task6.Point6Movable6;

public class CircleMovable extends Circle implements Movable{

    public CircleMovable(Point center, double radius) {
        super(center, radius);
    }

    @Override
    public void move(int x, int y) {
        try {
            ((PointMovable)getCenter()).move(x, y);
        }
        catch (Exception e){
            getCenter().x += x;
            getCenter().y+= y;
        }
    }
}
