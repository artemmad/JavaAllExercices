package ru.mirea.exercise7;

import ru.mirea.exercise7.dish.Dish;

import ru.mirea.exercise7.dish.Kazan;
import ru.mirea.exercise7.dish.Plate;
import ru.mirea.exercise7.dish.Pan;

import ru.mirea.exercise7.dog.Dog;

import ru.mirea.exercise7.dog.Shepherd;
import ru.mirea.exercise7.dog.Dachshund;

public class Main {
    public static void main(String[] args){
        Dish plate = new Plate(4,3);
        Dish pan = new Pan(7,2);
        Dish kazan = new Kazan(15,"Чугун");
        kazan.fill(300);
        plate.fill(50);
        pan.fill(plate.empty());
        plate.fill(100);
        kazan.fill(plate.empty());

        System.out.println(String.format("Объем тарелки %.2f / %.2f\n ---"
                , plate.getContent(), plate.getVolume()));

        System.out.println(String.format("Объем сковороды %.2f / %.2f\n ---"
                , pan.getContent(), pan.getVolume()));

        System.out.println(String.format("Объем казана %.2f / %.2f\nМатериал: %s\n --- "
                , kazan.getContent(), kazan.getVolume(), kazan.getMater() ));

        System.out.println(new Dachshund("Найда", 4));
        System.out.println(new Shepherd("Мухтар", 6));
    }
}
