package com.company;

public class Main {

    public static void main(String[] args) {
        //#8
        FurnitureShop furnitureShop = new FurnitureShop();
        furnitureShop.products[0] = new Bed ("Wood", 2);
        furnitureShop.products[1] = new Chair ("Wood", true);
        furnitureShop.products[2] = new Chair ("Aluminium", false);
        furnitureShop.products[3] = new Bed ("Steel", 1);
        furnitureShop.products[4] = new Bed ("Steel", 2);
        System.out.println();
        furnitureShop.Purchase(2);
        System.out.println();
        furnitureShop.Purchase(4);
        System.out.println();
        furnitureShop.Purchase(4);
        System.out.println();
        System.out.println(furnitureShop);
    }
}
