package com.company;

public class Main {

    public static void main(String[] args) {
        Dish spoon1 = new Spoon("Wood",false);
        Spoon spoon2 = new Spoon("Silver",false);
        spoon2.setTableSpoon(true); //не сработает для spoon1
        Dish plate = new Plate ("Aluminium",5,5);
        System.out.println(spoon1.toStringAbstract()); //сработает даже если в Dish нет toStringAbstract
        System.out.println(spoon2.toStringAbstract()); //не сработает если в Dish нет toStringAbstract
        System.out.println(plate.toStringAbstract());
        System.out.println();
        Dog dog1 = new Dog1();
        Dog2 dog2 = new Dog2();
        System.out.println(dog1.toStringAbstract()); //не сработает если в Dog нет toStringAbstract
        System.out.println(dog2.toStringAbstract()); //сработает даже если в Dog нет toStringAbstract
        System.out.println();
    }
}
