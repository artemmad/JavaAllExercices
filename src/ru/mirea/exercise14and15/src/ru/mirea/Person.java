package ru.mirea;

import ru.mirea.ATM.acc;

public class Person {
    private acc a;
    private String name;
    public Person(String name) {
        this.name = name;
        a=new acc();
        this.a.setBl(777.88);
    }

    public String getName() {
        return name;
    }

    public acc getNewAc() {
        return a;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }}