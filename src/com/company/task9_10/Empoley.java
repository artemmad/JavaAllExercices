package com.company.task9_10;

public class Empoley implements EmployeePosition {
    private String surname;
    private String name;


    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getJobTitle() {
        return null;
    }

    @Override
    public double calcSalary(double baseSalary) {
        return baseSalary;
    }
}
