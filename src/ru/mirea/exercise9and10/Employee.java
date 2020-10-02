package ru.mirea.exercise9and10;

public class Employee implements EmployeePosition {
    public String SecName;
    public String FirstName;
    public String pos;
    public double baseSalary;
    public double bonusSalary;


    Employee(String FirstName, String SecName,String pos, double baseSalary,double bonusSalary){

        this.SecName = SecName;
        this.FirstName = FirstName;
        this.pos = pos;
        this.bonusSalary = bonusSalary;
        this.baseSalary = baseSalary;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "       Работник\n" +
                "   Фамилия: " + SecName + '\n' +
                "   Имя: " + FirstName + '\n' +
                "         ----";
    }

    @Override
    public void getJobTitle() {
        System.out.printf("       Должность\n%s\n         ----\n", pos);
    }

    @Override
    public void calcSalary() {
        double res;
        res = bonusSalary + baseSalary;
        System.out.println("Зарплата: " + res + " руб.\n         ===");

    }

}
