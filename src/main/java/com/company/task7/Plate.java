package com.company.task7;

public class Plate extends Dish {

    int radius;
    int deep;
    double volume;

    public Plate(int radius, int deep) {
        this.radius = radius;
        this.deep = deep;
        calcVolume();
    }
    public void Foodiseaten(){
        System.out.println("Еда кончилась. Галя, жрать!");
    }

    @Override
    public void calcVolume() {
        volume = radius * deep;
    }
}
