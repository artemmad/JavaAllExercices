package com.company;

public class Main {

    public static void main(String[] args) {
	Company company = new Company();
	company.hireAll();
	System.out.println(company.getTopSalaryStaff(15));
        System.out.println(company.getLowestSalaryStaff(30));
        int size=company.employees.size()-1;
        for (int i=0;i<size;i++){
            size-=1;
            company.fire();
        }
        System.out.println(company.getTopSalaryStaff(15));
        System.out.println(company.getLowestSalaryStaff(30));
    }
}
