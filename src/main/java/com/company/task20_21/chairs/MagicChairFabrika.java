package com.company.task20_21.chairs;

public class MagicChairFabrika implements Fabrika {

    @Override
    public Chair createChair(){
        return new MagicChair();
    }
}
