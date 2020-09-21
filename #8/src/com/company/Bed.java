package com.company;

public class Bed extends Furniture {
    int tiers;

    public Bed(String material, int tiers) {
        super(material);
        this.tiers = tiers;
    }

    @Override
    public String toString() {
        return "bed{" +
                "tiers=" + tiers +
                ", material='" + material  +
                '}'+ '\n';
    }
}
