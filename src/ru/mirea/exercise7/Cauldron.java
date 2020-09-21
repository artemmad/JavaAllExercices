package ru.mirea.exercise7;

public class Cauldron extends Dish{
    public Cauldron(double radius) {
        this.radius = radius;
        this.height = radius;
        this.volume = radius * radius * radius * Math.PI * 4 / 6;
    }
}
