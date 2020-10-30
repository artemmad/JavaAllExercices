package com.company.task8;

public abstract class Furniture {
    private int cost;
    private String name;

    public Furniture(int cost, String name) {
        this.cost = cost;
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    public String getName() {
        return name;
    }
}
