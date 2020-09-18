package com.company.task6;

public class Rectangle {
    protected Point6 RightTop;
    protected Point6 LeftBottom;

    public Rectangle(Point6 rightTop, Point6 leftBottom) {
        RightTop = rightTop;
        LeftBottom = leftBottom;
    }

    public Point6 getRightTop() {
        return RightTop;
    }

    public Point6 getLeftBottom() {
        return LeftBottom;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "RightTop=" + RightTop +
                ", LeftBottom=" + LeftBottom +
                '}';
    }
}
