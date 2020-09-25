package com.company.task7;

public abstract class Dog {
    private String name;
    private int weight;
    public String getName() { return name; }
    public Dog(String name, int weight){
        this.name=name;
        this.weight=weight;
    };
}
