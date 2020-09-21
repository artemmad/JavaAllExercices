package com.company;

public abstract class Dish {
    String material;
    public Dish(String material) {
        this.material = material;
    }

    public String toStringAbstract() {
        return "Dish{" +
                "material='" + material + '\'' +
                '}';
    }
}

