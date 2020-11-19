package com.company.task20_21.chairs;

public class VictorianChair implements Chair {
    public VictorianChair() {
        System.out.println("Викторианский стул у вас)");
    }

    @Override
    public void sit() {
            System.out.println("Вы сели на викторианский стул");
    }
}
