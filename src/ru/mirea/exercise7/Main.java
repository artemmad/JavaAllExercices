package ru.mirea.exercise7;

public class Main {
    public static void main(String[] args){
        Dish plate = new Plate(3, 1);
        Dish pan = new Pan(5, 2);
        Dish cauldron = new Cauldron(10);
        cauldron.fill(1000);
        plate.fill(100);
        pan.fill(plate.empty());
        plate.fill(100);
        cauldron.fill(plate.empty());
        System.out.println(String.format("plate amount: %.2f / %.2f"
                , plate.getContent(), plate.getVolume()));
        System.out.println(String.format("pan amount: %.2f / %.2f"
                , pan.getContent(), pan.getVolume()));
        System.out.println(String.format("cauldron amount: %.2f / %.2f"
                , cauldron.getContent(), cauldron.getVolume()));

        System.out.println(new Basenji("Zola", 8));
        System.out.println(new Labrador("Polkan", 12));
    }
}
