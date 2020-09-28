package com.company;

import java.util.Random;

public abstract class Employee implements EmployeePosition{
    protected String surname;
    protected String name;
    protected double baseSalary;
    protected String position;

    public Employee() {
        this.surname = "Surname";
        this.name = "Name";
        this.baseSalary = new Random().nextInt(25000) + 115000;
    }
    public String getJobTitle(){
        return null;
    }
    public double calcSalary(double baseSalary) {
        return 0;
    }
}
