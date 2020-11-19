package com.company.task9_10;

public class TopManager extends Empoley implements EmployeePosition {
    private int Income;

    public TopManager(String name, String surname,int income) {
        super(name, surname);
        Income = income;
    }

    @Override
    public String getJobTitle() {
        return "TopManager";
    }

    @Override
    public double calcSalary(double baseSalary) {
        if (Income > 100000000) {
            return baseSalary + baseSalary * 1.5;
        } else return baseSalary;
    }
}
