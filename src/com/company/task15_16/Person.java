package com.company.task15_16;

public class Person {
    private String name;
    private account myaccount;
    public Person(String name) {
        this.name = name;
        myaccount=new account();
        this.myaccount.setBalance(7328.67);
    }

    public String getName() {
        return name;
    }

    public account getMyaccount() {
        return myaccount;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }}