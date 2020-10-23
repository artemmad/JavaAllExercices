package ru.mirea;

public class Robot extends Leg{

    Leg Left = new Leg("Левая");
    Leg Right = new Leg("Правая");

    public Robot(String name) {
        super(name);
    }

    public void startWalking() {
        Left.start();
        Right.start();
    }

}
