package ru.mirea.exercise7;

public class Pan extends Dish {
    public Pan(double radius, double height) {
        this.radius = radius;
        this.height = height;
        this.volume = height * radius * radius * Math.PI;
    }
}
