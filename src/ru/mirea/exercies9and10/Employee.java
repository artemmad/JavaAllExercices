package ru.mirea.exercies9and10;

public class Employee implements EmployeePosition{

    public char randomname() {
            double a = (65 + (double) Math.random() * 25);
            char name = (char) a;
        return name;
    }

public char randomsurname(){
        double a = (65 + (double) Math.random() * 25);
        char surname = (char) a;
        return surname;
    }
    public char surname;

    public char name;

    public double baseSalary;

    public String position;

    @Override
    public String getJobTitle() {
        return null;
    }

    public boolean equals(Employee o) {
        if (this.hashCode() == o.hashCode()) return true;
        if (o == null || getClass() != o.getClass()) return false;
        return  false;
    }

    @Override
    public double calcSalary(double baseSalary) {
        return baseSalary;
    }


}
