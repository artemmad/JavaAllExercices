package ru.mirea.exercies9and10;



import java.util.ArrayList;
import java.util.List;

public class Main9_10 {
    public static void main(String[] args) {
        ArrayList<Employee> workers = new ArrayList<Employee>();
        Company company = new Company();
  /*      Employee work = new Manager();
        workers.add(work);
        company.hire(workers);
        System.out.println(workers.get(0));*/
        int i = 0;
         while(i < 180){
        Employee work1 = new Operator();
        workers.add(work1);
        ++i ;
        }
         i = 0;
        while(i < 80){
            Employee work1 = new Manager();
            workers.add(work1);
            i++;
        }
        i = 0;
        while(i < 10){
            Employee work1 = new TopManager();
            workers.add(work1);
            i++;
        }

        company.hireAll(workers);
        company.output(workers);

       List<Employee> emp = company.getTopSalaryStaff(10);
      for ( int k = 0; k < 10; k++){
          System.out.println(emp.get(k));
       }
        System.out.println("-------------");
      List<Employee> emp1 = company.getLowestSalaryStaff(30);
        for ( int k = 0; k < 10; k++){
            System.out.println(emp.get(k));
        }

        company.firedivtwo(workers);

        company.output(workers);
    }
}
