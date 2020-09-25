package ru.mirea.exercise7.dish;

public class Plate extends Dish {
    public Plate(double radius, double height) {
        this.radius = radius;
        this.height = height;
        this.volume = radius * radius * radius * Math.PI * 4 / 6;
    }
}
