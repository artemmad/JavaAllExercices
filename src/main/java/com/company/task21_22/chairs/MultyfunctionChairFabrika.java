package com.company.task21_22.chairs;

public class MultyfunctionChairFabrika implements Fabrika {
    @Override
    public Chair createChair() {
        return new MultyfunctionChair();
    }
}
