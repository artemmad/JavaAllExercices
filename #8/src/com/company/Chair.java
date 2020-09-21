package com.company;

public class Chair extends Furniture {
    boolean hasBack;

    public Chair(String material, boolean hasBack) {
        super(material);
        this.hasBack = hasBack;
    }

    @Override
    public String toString() {
        return "chair{" +
                "hasBack=" + hasBack +
                ", material='" + material  +
                '}'+ '\n';
    }
}
