package ru.mirea.exercies8;

import java.util.ArrayList;

public class FurnitureShop{

ArrayList<furniture> arr = new ArrayList<furniture>();

public void add_furn(furniture m){

    arr.add(m);

}
public void output(){

    for(furniture num: arr ){
        num.buy();
    }

}
}
