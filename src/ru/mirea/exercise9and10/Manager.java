package ru.mirea.exercise9and10;

public class Manager extends Employee{

    Manager(String FirstName, String SecName, String pos, double baseSalary, double bonusSalary) {
        super(FirstName, SecName, pos, baseSalary, bonusSalary);
    }

    @Override
    public void getJobTitle() {
        super.getJobTitle();

    }

    @Override
    public void calcSalary() {
          super.calcSalary();
    }
}