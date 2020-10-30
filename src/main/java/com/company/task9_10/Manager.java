package com.company.task9_10;

import java.util.Random;

public class Manager extends Empoley implements EmployeePosition{
    private int personalIncome;
    public Manager(String name,String Surname) {
        super(name, Surname);
        Random random= new Random();
        personalIncome=random.nextInt(140-115+1);
    }

    @Override
    public String getSurname() {
        return super.getSurname();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getJobTitle() {
        return ("Manager");
    }

    @Override
    public double calcSalary(double baseSalary) {

        return (baseSalary+(personalIncome*1000)*0.05);
    }


    @Override
    public void setSurname(String surname) {
        super.setSurname(surname);
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }
}
