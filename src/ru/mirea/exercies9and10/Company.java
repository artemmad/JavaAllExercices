package ru.mirea.exercies9and10;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Company {
    private int income = 10000000;

    private ArrayList <Employee> employeelist = new ArrayList<Employee>();

    public void hire(ArrayList<Employee> employee){
        int i = 0;
    this.employeelist.add(employee.get(i));
    }
    public void hireAll(ArrayList<Employee> employee){
        employeelist.addAll(employee);
    }
    public void fire(char name,char surname){
        for (int i=0;i<employeelist.size();i++){
            boolean bl =this.employeelist.get(i).equals(new Employee());
            if (bl)
                this.employeelist.remove(i);
        }
    }

    public void firedivtwo(ArrayList<Employee> employees){

        for (int i = 0;i < employees.size();i++){
            employees.remove(i);
        }
    }

    public int getincome(){
        return income;
    }

    public void output(ArrayList<Employee> employeelist){
        int i = employeelist.size();
        System.out.println("size: " + i);
    }
    public List<Employee> getTopSalaryStaff(int count) {
        List<Employee> sallary = new ArrayList<>();
        for (int i = 0; i < this.employeelist.size(); i++)
            for (int j = 0; j < this.employeelist.size()-1; j++) {
                if (this.employeelist.get(j).calcSalary(0) < this.employeelist.get(j+1).calcSalary(0)) {
                    Collections.swap(employeelist,j,j+1);
                }
            }
        sallary.add(employeelist.get(0));
        int k=0;
        for (int i=1;i<this.employeelist.size();i++) {
            for (Employee employee: sallary) {
                if (employee.calcSalary(0) == employeelist.get(i).calcSalary(0))
                    k++;
            }
            if (k==0)
                sallary.add(employeelist.get(i));
            k=0;
        }
        return  sallary.subList(0,count);
    }
    public List<Employee> getLowestSalaryStaff (int count) {
        List<Employee> sallary = new ArrayList<>();
        for (int i = 0; i < this.employeelist.size(); i++)
            for (int j = 0; j < this.employeelist.size()-1; j++) {
                if (this.employeelist.get(j).calcSalary(0) > this.employeelist.get(j+1).calcSalary(0)) {
                    Collections.swap(employeelist,j,j+1);
                }
            }
        sallary.add(employeelist.get(0));
        int k=0;
        for (int i=1;i<this.employeelist.size();i++) {
            for (Employee empoley : sallary) {
                if (empoley.calcSalary(0) == employeelist.get(i).calcSalary(0))
                    k++;
            }
            if (k==0)
                sallary.add(employeelist.get(i));
            k=0;
        }
        return  sallary.subList(0,count);

    }
}
