package com.company;

public class Spoon extends Dish{
    boolean isTableSpoon;
    public Spoon(String material, boolean isTableSpoon) {
        super(material);
        this.isTableSpoon = isTableSpoon;
    }

    public void setTableSpoon(boolean tableSpoon) {
        isTableSpoon = tableSpoon;
    }

    @Override
    public String toStringAbstract() {
        return "Spoon{" +
                "isTableSpoon=" + isTableSpoon +
                ", material='" + material + '\'' +
                '}';
    }
}
