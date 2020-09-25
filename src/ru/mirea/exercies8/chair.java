package ru.mirea.exercies8;

public class chair  extends furniture{
    private int price;
    private String material;

    public chair(int price, String material) {
        this.price = price;
        this.material = material;
    }

    @Override
    public void buy(){
        System.out.println(price + ", " + material);
    }

}
