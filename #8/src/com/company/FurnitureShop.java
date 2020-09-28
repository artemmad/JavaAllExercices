package com.company;

import java.util.Arrays;

public class FurnitureShop implements Purchasable {
    Furniture[] products = new Furniture[5];
    boolean[] purchasable = new boolean[5];
    FurnitureShop(){
        for (int i=0;i<purchasable.length;i++){
            purchasable[i]=true;
        }
    }
public void Purchase(int i){
    System.out.println("This " + products[i].toString() + ((purchasable[i]) ? "was purchased!" : "is already purchased"));
    purchasable[i]=false;
}
    @Override
    public String toString() {
        return "FurnitureShop{" +
                "products=" + Arrays.toString(products) +
                ", purchased=" + Arrays.toString(purchasable) +
                '}';
    }
}
