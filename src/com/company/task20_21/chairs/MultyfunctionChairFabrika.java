package com.company.task20_21.chairs;

public class MultyfunctionChairFabrika implements Fabrika {
    @Override
    public Chair createChair() {
        return new MultyfunctionChair();
    }
}
