package ru.mirea.exercies8;

public abstract class Shape {
    protected String color;
    protected boolean filled;
    public Shape(){

    }
     public Shape(String color, boolean filled){

     }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {

    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
   public double getArea(){
        double Area=0;
        return Area;
   }
   public double getPerimeter(){
    double  Perimeter = 0;
    return Perimeter;
   }

}
