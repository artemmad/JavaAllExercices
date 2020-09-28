package com.company;

import java.util.Random;

public class Operator extends Employee{
    Operator(){
        position="Operator";
    }
    @Override
    public String getJobTitle() {
        return position;
    }

    @Override
    public double calcSalary(double baseSalary) {
        return baseSalary;
    }
}
