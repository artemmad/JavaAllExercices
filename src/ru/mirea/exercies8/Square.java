package ru.mirea.exercies8;

public class Square extends Rectangle {
    public double side;

    Square() {}

    Square(double side){
        setSide(side);
    }

    Square(double side, String color, boolean filled){
        super(side, side);
        setFilled(filled);
        setColor(color);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }
}