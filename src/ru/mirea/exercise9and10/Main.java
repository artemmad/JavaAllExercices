package ru.mirea.exercise9and10;

public class Main{

public static void main(String args[]){
        Employee emp1=new Employee("Александр","Петров","Senior Security Officer",700,77);
        System.out.println(emp1);
        emp1.getJobTitle();
        emp1.calcSalary();
        }
}