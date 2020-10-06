package ru.mirea.exercise9and10;

public class Employee implements ru.mirea.exercise9and10.EmployeePosition {
    public String SecName;
    public String FirstName;
    public String pos;
    public double baseSalary;
    public double bonusSalary;


    Employee(String FirstName, String SecName){

        this.SecName = SecName;
        this.FirstName = FirstName;
        //this.pos = pos;
        //this.bonusSalary = bonusSalary;
        //this.baseSalary = baseSalary;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "       Работник\n" +
                "   Фамилия: " + SecName + '\n' +
                "   Имя: " + FirstName + '\n' +
                "         ----";
    }
//Геттера и сеттера
    public String getSecName() {
        return SecName;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setSecName(String secName) {
        SecName = secName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

//Методы
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

    //Поиск существующих работников
    public boolean equals(Employee a){
        if (this.hashCode() == a.hashCode()) return true;
        if (a == null || getClass() != a.getClass()) return false;
        return false;
    }

    @Override
    public int hashCode() {
        return FirstName.hashCode() + SecName.hashCode();
    }

}
