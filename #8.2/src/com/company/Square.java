package com.company;

public class Square extends Rectangle {
    public Square(){
        this.color="While";
        this.filled=false;
        this.width=1;
        this.length=1;
    }

    public Square(double side){
        this.length=side;
        this.width=side;
        this.color="While";
        this.filled=false;
    }

    public Square(String color, boolean filled, double side) {
        this.color=color;
        this.filled=filled;
        this.length=side;
        this.width=side;
    }
    public void setSide(double side){
        this.width=side;
        this.length=side;
    }
    public double getSide(){
        return length;
    }
    public void setLength(double side){
        this.length=side;
    }
    public void setWidth(double side){
        this.width=side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "width=" + width +
                ", length=" + length +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}