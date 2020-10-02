package ru.mirea.exercise9and10;

public class Employee implements EmployeePosition {
    public String SecName;
    public String FirstName;
    public String pos;
    public double baseSalary = 0;
    public double bonusSalary = 0;


    Employee(String FirstName, String SecName,String pos, double baseSalary,double bonusSalary){

        this.SecName = SecName;
        this.FirstName = FirstName;
        this.pos = pos;
        this.bonusSalary = bonusSalary;
        this.baseSalary = baseSalary;
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getSecName() {
        return SecName;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "       Работник\n" +
                "Фамилия='" + SecName + '\'' +
                ", Имя='" + FirstName + '\'' +
                "         ----";
    }

    @Override
    public void getJobTitle() {
            System.out.printf("%s",pos);

    }

    @Override
    public void calcSalary() {
            double res;
            res = bonusSalary + baseSalary;
            System.out.println("Зарплата: " + res + "руб.");
        }
    }
