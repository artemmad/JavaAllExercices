package ru.mirea.exercise7.dish;

public class Kazan extends Dish{
    public Kazan(double radius, String mater) {
        this.radius = radius;
        this.height = radius;
        this.volume = radius * radius * radius * Math.PI * 4 / 6;
	this.mater = mater;
    }
}
