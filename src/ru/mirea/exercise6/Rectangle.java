package ru.mirea.exercise6;

public class Rectangle {
    protected Point RightTop;
    protected Point LeftBottom;

    public Rectangle(Point rightTop, Point leftBottom) {
        RightTop = rightTop;
        LeftBottom = leftBottom;
    }

    public Point getRightTop() {
        return RightTop;
    }

    public Point getLeftBottom() {
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