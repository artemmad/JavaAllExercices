package com.company.task8;

public class Square extends Rectangle {
    public Square(){};

    public Square(double side) {
        super(side, side);
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled, side, side);
    }

    @Override
    public void setWidth(double side) {
        super.setWidth(side);
    }

    @Override
    public void setLength(double side) {
        super.setLength(side);
    }
    public double getSide(){
       return super.getWidth();
    }
    public  void setSide(double side){};

    @Override
    public String toString() {
        return "Square{" +
                "side=" + length +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
