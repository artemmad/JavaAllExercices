package ru.mirea.exercise9and10;

import ru.mirea.exercise9and10.Employee;
import ru.mirea.exercise9and10.Manager;

import java.awt.*;
import java.util.ArrayList;

public class Main {

public static void main(String[] args){
        int e = 0;
        int f = 1;
        ArrayList<Employee> workers = new ArrayList<Employee>();
        //Company test_company = new Company();

        while (e < 5){
               Employee emp0 = new Employee("Александр","Петров" + toString(f));
               workers.add(emp0);
               e++;
               f++;
        }
        }
        //test_company.hireall(workers);

        private static String toString(int f) {
                return Integer.toString(f);
        }
}