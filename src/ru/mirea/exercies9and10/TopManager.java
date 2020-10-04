package ru.mirea.exercies9and10;

public class TopManager extends Employee implements EmployeePosition{
    Company income = new Company();
    Employee employee = new Employee();

    public TopManager() {
        this.name = employee.randomname();
        this.surname = employee.randomsurname();
        this .position = getJobTitle();
        this.baseSalary = calcSalary(0);
    }

    @Override
    public String getJobTitle() {
        employee.position = "TopManager";
      return employee.position;
    }

    @Override
    public double calcSalary(double baseSalary) {
        baseSalary =  115000 + (double) Math.random() * 25000 ;
        if (income.getincome() == 10000000 )
            baseSalary = baseSalary / 100 * 150;
        return baseSalary;
    }

    @Override
    public String toString() {
        return "TopManager{" +
                "surname=" + surname +
                ", name=" + name +
                ", baseSalary=" + baseSalary +
                " руб" +
                ", position='" + position + '\'' +
                '}';
    }
}
