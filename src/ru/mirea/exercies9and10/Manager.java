package ru.mirea.exercies9and10;

public class Manager extends Employee implements EmployeePosition {
    Employee employee = new Employee();

    public Manager() {
        this.name = employee.randomname();
        this.surname = employee.randomsurname();
        this.position = getJobTitle();
        this.baseSalary = calcSalary(0);
    }

    @Override
    public String getJobTitle() {
        employee.position = "Manager";
        return employee.position;
    }

    @Override
    public double calcSalary(double baseSalary) {
        baseSalary =  115000 + (double) Math.random() * 25000 ;
        baseSalary = baseSalary / 100 * 5;
        return baseSalary;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "surname=" + surname +
                ", name=" + name +
                ", baseSalary=" + baseSalary +
                ", position='" + position + '\'' +
                '}';
    }
}
