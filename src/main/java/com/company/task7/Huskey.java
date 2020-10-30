package com.company.task7;

public class Huskey extends Dog {
    public String stupidity;
    public Huskey(String name, int weight) {
        super(name, weight);
    }

    public void setStupidity(String stupidity) {
        this.stupidity = stupidity;
    }
    public void sofa(){
        System.out.println("Либо мы идем гулять, либо я ем твой диван. Ой, тоесть woof");
    }

}
