package com.company.task7;

public class Pudel extends Dog {
    public Pudel(String name, int weight) {
        super(name, weight);
    }
    private String color;

    public void setColor(String color) {
        this.color = color;
    }
    public void barking(){
        int i=0;
        while (i < 10000){
            System.out.println("woof");
            i++;
        }
    }

}
