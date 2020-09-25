package com.company.task7;

public class Main {
    public static void main(String[] args){
        Dish plate = new Plate(1,10);

        Dish pan = new Pan(20,100);

        plate.calcVolume();
        ((Pan)pan).makeBorsh();
        ((Plate)plate).Foodiseaten();
        Dog huskey1 =new Huskey("Stupid",48);
        ((Huskey)huskey1).sofa();
        Dog pudel1= new Pudel("Sera",10);
        ((Pudel)pudel1).barking();
    }

}
