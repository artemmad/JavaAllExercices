package com.company;

public class Dog1 extends Dog {
    String name = "Dog1";

    @Override
    public String toStringAbstract() {
        return "Dog1{" +
                "name='" + name + '\'' +
                '}';
    }
}
