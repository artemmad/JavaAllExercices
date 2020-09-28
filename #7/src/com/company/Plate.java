package com.company;

public class Plate extends Dish {
    int radius;
    int depth;
    public Plate(String material, int radius, int depth) {
        super(material);
        this.radius = radius;
        this.depth = depth;
    }

    public int getApproxVolume(){
        return (int)Math.PI*radius*depth;
    }
    @Override
    public String toStringAbstract() {
        return "Plate{" +
                "radius=" + radius +
                ", depth=" + depth +
                ", material='" + material + '\'' +
                '}';
    }
}
