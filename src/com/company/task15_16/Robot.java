package com.company.task15_16;

public class Robot {
    private Leg right;
    private Leg left;


    public Robot() {
        right=new Leg("right");
        left=new Leg("left");
    }
    public void step() throws InterruptedException {
        right.start();
        left.start();
    }
}
