package ru.mirea.exercise7;

public class Plate extends Dish{

    int radius;
    int deep;
    double volume;

    public Plate(int radius, int deep) {
        this.radius = radius;
        this.deep = deep;
        calcVolume();
    }

    @Override
    public void calcVolume() {
        volume = radius * deep;
    }
}
