package ru.mirea.exercise7;

public abstract class Dish {
    protected double radius;
    protected double height;
    protected double volume;
    protected double contentAmount = 0;

    public double getVolume() {
        return volume;
    }
    public double getContent() {
        return contentAmount;
    }
    public void fill(double amount) {
        contentAmount += amount;
        if(contentAmount > volume)
            contentAmount = volume;
    }
    public double empty() {
        double amount = contentAmount;
        contentAmount = 0;
        return amount;
    }
}
