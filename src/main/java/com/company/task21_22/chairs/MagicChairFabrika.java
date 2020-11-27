package com.company.task21_22.chairs;

public class MagicChairFabrika implements Fabrika {

    @Override
    public Chair createChair(){
        return new MagicChair();
    }
}
