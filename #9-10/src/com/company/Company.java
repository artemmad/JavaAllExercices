package com.company;
import java.util.*;

public class Company {
    int n;
    Scanner scanner = new Scanner(System.in);
    List <Employee> employees = new ArrayList<>();
    public void hire(){
    System.out.println("Hire: 0 - Manager, 1 - TopManager, other - Operator");
    switch (n = scanner.nextInt()){
        case 0:{
            employees.add(new Manager());
            break;
        }
        case 1:{
            employees.add(new TopManager(this));
            break;
        }
        default:{
            employees.add(new Operator());
            break;
        }
        }
        System.out.println("Process finished."+'\n');
    }
    public void hireAll(){
        System.out.println("How many Operators to hire?");
        n = scanner.nextInt();
        for (int i = 0; i<n;i++){
            employees.add(new Operator());
        }
        System.out.println("How many Managers to hire?");
        n = scanner.nextInt();
        for (int i = 0; i<n;i++){
            employees.add(new Manager());
        }
        System.out.println("How many TopManagers to hire?");
        n = scanner.nextInt();
        for (int i = 0; i<n;i++){
            employees.add(new TopManager(this));
        }
        System.out.println("Process finished."+'\n');
    }
    public void fire(){
    employees.remove(new Random().nextInt(employees.size()-1));
    }
    public double getIncome(){
        double buff=0;
        for (int i=0;i<employees.size();i++){
        buff=buff+employees.get(i).baseSalary- (employees.get(i).position!="TopManager" ? employees.get(i).calcSalary(employees.get(i).baseSalary) : 0);
        }
        return buff;
    }
    public List getTopSalaryStaff(int count){
    List<Double> salaries = new ArrayList<>();
    for (int i=0; i<employees.size();i++){
        salaries.add(employees.get(i).calcSalary(employees.get(i).baseSalary));
    }
        Collections.sort(salaries);
        Collections.reverse(salaries);
        List<Double> topSalaries = new ArrayList<>();
        for (int i=0;i<count;i++){
            topSalaries.add(salaries.get(i));
        }
        return topSalaries;
    }
    public List getLowestSalaryStaff(int count){
        List<Double> salaries = new ArrayList<>();
        for (int i=0; i<employees.size();i++){
            salaries.add(employees.get(i).calcSalary(employees.get(i).baseSalary));
        }
        Collections.sort(salaries);
        List<Double> lowestSalaries = new ArrayList<>();
        for (int i=0;i<count;i++){
            lowestSalaries.add(salaries.get(i));
        }
        Collections.reverse(lowestSalaries);
        return lowestSalaries;
    }
}
