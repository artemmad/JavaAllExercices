package com.company.task21_22.chairs;

public class VictorianChairFabrika implements Fabrika {


    @Override
    public Chair createChair() {
        return new VictorianChair();
    }
}
