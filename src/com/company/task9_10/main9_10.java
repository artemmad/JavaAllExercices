package com.company.task9_10;


import java.util.ArrayList;
import java.util.List;

public class main9_10{
        public static void main(String[] args){
            int k=0;
            int l=1;
            ArrayList<Empoley> workers = new ArrayList<Empoley>();
            Company comp=new Company();
                while (k<180){
                    Empoley empoley=new Operator("Jhon","Sir"+toString(l));
                    workers.add(empoley);
                    l++;
                    k++;
                }
                k=0;
                while (k<80){
                    Empoley empoley=new Manager("Jhon","Sir"+toString(l));
                    workers.add(empoley);
                    l++;
                    k++;
                }
                k=0;
                while (k<10){
                    Empoley empoley=new TopManager("Jhon","Sir"+toString(l), comp.getIncome());
                    workers.add(empoley);
                    l++;
                    k++;
                }
            comp.hireall(workers);
            List<Empoley> comp1 = comp.getTopSalaryStaff(workers.size()-1);
            for(int i=0; i<workers.size()-1;i++) {
                System.out.println((i+1)+".  "+comp1.get(i).calcSalary(comp.getBaseSalary())+"руб");
            }
            comp.fire();
            List<Empoley> comp2 = comp.getLowestSalaryStaff(workers.size());
            for(int i=0; i<workers.size();i++) {
                System.out.println((i+1)+".  "+comp2.get(i).calcSalary(comp.getBaseSalary())+"руб");
            }

        }

    private static String toString(int k) {
            return Integer.toString(k);
    }
}
