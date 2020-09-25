package ru.mirea.exercies8;

public class table extends furniture{
private int price;
private String matherial;

    public table(int price, String matherial) {
        this.price = price;
        this.matherial = matherial;
    }
    public void buy(){
        System.out.println(price + ", " + matherial);
    }
}
