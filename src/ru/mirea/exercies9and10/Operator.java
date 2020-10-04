package ru.mirea.exercies9and10;

public class Operator extends Employee implements EmployeePosition {

    Employee employee = new Employee();

    public Operator() {
    this.name = employee.randomname();
    this.surname = employee.randomsurname();
    this.position = getJobTitle();
    this.baseSalary = calcSalary(0);
    }

    @Override
    public String getJobTitle() {
        employee.position = "Operator";
        return employee.position;
    }

    @Override
    public double calcSalary(double baseSalary) {
        baseSalary =  115000 + (double) Math.random() * 25000 ;
        return baseSalary;
    }

    @Override
    public String toString() {
        return "Operator{" +
                ", surname=" + surname +
                ", name=" + name +
                ", baseSalary=" + baseSalary +
                ", position='" + position + '\'' +
                '}';
    }
}
