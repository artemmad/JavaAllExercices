package com.company.task9_10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Company {
    private int baseSalary;
    private int Income;
    private ArrayList<Empoley> empolies=new ArrayList<Empoley>();
    public Company() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите фиксированный оклад");
        baseSalary=scanner.nextInt();
        System.out.println("Введите прибыль компании");
        Income=scanner.nextInt();
    }

    public ArrayList<Empoley> getEmpolies() {
        return empolies;
    }

    public int getBaseSalary() {
        return baseSalary;
    }

    public int getIncome(){
        return Income;
    }
    public void hire(ArrayList<Empoley> empolies){
            String name,surname;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите имя");
            name=scanner.nextLine();
            System.out.println("Введите фамилию");
            surname=scanner.nextLine();
            for (int i=0;i<empolies.size();i++){
                if (name.equals(empolies.get(i).getName())){
                    if (surname.equals(empolies.get(i).getSurname())){
                        this.empolies.add(empolies.get(i));
                    }
                }
            }
    }
    public List<Empoley> getTopSalaryStaff(int count) {
        List<Empoley> sallary = new ArrayList<>();
        for (int i = 0; i < this.empolies.size(); i++)
            for (int j = 0; j < this.empolies.size()-1; j++) {
                if (this.empolies.get(j).calcSalary(baseSalary) < this.empolies.get(j+1).calcSalary(baseSalary)) {
                    Collections.swap(empolies,j,j+1);
                }
            }
        sallary.add(empolies.get(0));
            int k=0;
        for (int i=1;i<this.empolies.size();i++) {
            for (Empoley empoley : sallary) {
                if (empoley.calcSalary(baseSalary) == empolies.get(i).calcSalary(baseSalary))
                    k++;
            }
            if (k==0)
                sallary.add(empolies.get(i));
            k=0;
        }
        return  sallary.subList(0,count);
    }
    public List<Empoley> getLowestSalaryStaff (int count) {
        List<Empoley> sallary = new ArrayList<>();
        for (int i = 0; i < this.empolies.size(); i++)
            for (int j = 0; j < this.empolies.size()-1; j++) {
                if (this.empolies.get(j).calcSalary(baseSalary) > this.empolies.get(j+1).calcSalary(baseSalary)) {
                    Collections.swap(empolies,j,j+1);
                }
            }
        sallary.add(empolies.get(0));
            int k=0;
        for (int i=1;i<this.empolies.size();i++) {
            for (Empoley empoley : sallary) {
                if (empoley.calcSalary(baseSalary) == empolies.get(i).calcSalary(baseSalary))
                    k++;
            }
            if (k==0)
                sallary.add(empolies.get(i));
            k=0;
        }
        return  sallary.subList(0,count);

    }

    public void hireall (ArrayList<Empoley> empolies){
        this.empolies.addAll(empolies);
    }
    public void fire(String name,String surname){
        for (int i=0;i<empolies.size();i++){
            boolean ventil =this.empolies.get(i).equals(new Empoley(name,surname));
            if (ventil)
                this.empolies.remove(i);
                }
            }
}