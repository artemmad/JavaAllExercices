package ru.mirea.exercise7;

public class Main {
    public static void main(String[] args){
        Dish plate = new Plate(1,10);

        Dish pan = new Pan(20,100);

        plate.calcVolume();
        ((Pan)pan).makeBorsh();

        System.out.println(new Labrador("Sharik", 7));

    }


}
