package com.company.task9_10;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class main9_10{
        public static void main(String[] args) {
            Random random = new Random();
            int k = 0;
            int l = 1;
            ArrayList<Empoley> workers = new ArrayList<Empoley>();
            ArrayList<Empoley> sallary = new ArrayList<Empoley>();
            Company comp = new Company();
            while (k < 180) {
                Empoley empoley = new Operator("Jhon", "Sir" + toString(l));
                workers.add(empoley);
                l++;
                k++;
            }
            k = 0;
            while (k < 80) {
                Empoley empoley = new Manager("Jhon", "Sir" + toString(l));
                workers.add(empoley);
                l++;
                k++;
            }
            k = 0;
            while (k < 10) {
                Empoley empoley = new TopManager("Jhon", "Sir" + toString(l), comp.getIncome());
                workers.add(empoley);
                l++;
                k++;
            }
            comp.hireall(workers);
            List<Empoley> comp1 = comp.getTopSalaryStaff(1);
            for (int i = 0; i < 1; i++) {
                System.out.println((i + 1) + ".  " + comp1.get(i).calcSalary(comp.getBaseSalary()) + "руб");
            }
            System.out.println();
            List<Empoley> comp2 = comp.getLowestSalaryStaff(1);
            for (int i = 0; i < 1; i++) {
                System.out.println((i + 1) + ".  " + comp2.get(i).calcSalary(comp.getBaseSalary()) + "руб");
            }
            for (int i = 0; i < (workers.size()/2); i++) {
                comp.fire("Jhon", "Sir" + toString(random.nextInt(30)));
            }
            ArrayList<Empoley> workersAfterFire = new ArrayList<Empoley>((workers.size()/2));
            workersAfterFire=comp.getEmpolies();
            System.out.println();
            k=0;
            for (Empoley empoley : workersAfterFire) {
                if (empoley != null && empoley.getSurname()!= null) {
                    k++;
                    System.out.println((k) + ".  " + empoley.getSurname());
                }
            }
        }
    private static String toString(int k) {
            return Integer.toString(k);
    }
}
