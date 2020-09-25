package ru.mirea.exercies8;

public class Square extends Rectangle {
    private double side;
    public Square(){

    }
    public Square(double side){

    }
    public Square(double side, String color, boolean filled){

    }

    public double getSide() {
        return side;
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
    }

    @Override
    public void setLenght(double lenght) {
        super.setLenght(lenght);
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }

}
