package com.company;

public class Dog2 extends Dog {
    String name = "Dog2";

    @Override
    public String toStringAbstract() {
        return "Dog2{" +
                "name='" + name + '\'' +
                '}';
    }
}
