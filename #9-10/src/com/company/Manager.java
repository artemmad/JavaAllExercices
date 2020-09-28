package com.company;

import java.util.Random;

public class Manager extends Employee implements EmployeePosition {
    Manager(){
        position="Manager";
    }
    @Override
    public String getJobTitle() {
        return position;
    }

    @Override
    public double calcSalary(double baseSalary) {
        return baseSalary*1.05;
    }
}
