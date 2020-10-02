package ru.mirea.exercise9and10;

public class Main{

public static void main(String[] args){
        Employee emp1=new Employee("Александр","Петров","Senior Security Officer",700,77);
        System.out.println(emp1);
        emp1.getJobTitle();
        emp1.calcSalary();

        Manager mgr1 = new Manager("Сергей","Бурунов","Начальник отдела",1500,500);
        System.out.println(mgr1);
        mgr1.getJobTitle();
        mgr1.calcSalary();
        }
}