package com.company;

import java.util.Random;

public class TopManager extends Employee{
    Company company;
    TopManager(Company company){
        position="TopManager";
        this.company=company;
    }
    @Override
    public String getJobTitle() {
        return position;
    }

    @Override
    public double calcSalary(double baseSalary) {
        return baseSalary*(this.company.getIncome()>10000000 ? 1.5 : 1);
    }
}
