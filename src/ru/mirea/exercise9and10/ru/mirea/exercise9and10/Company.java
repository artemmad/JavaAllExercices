package ru.mirea.exercise9and10;

import ru.mirea.exercise9and10.Employee;

import java.util.ArrayList;
import java.util.Scanner;

public class Company {
   private double profit;
   private double baseIncome;

   private ArrayList<Employee> proletarians = new ArrayList<Employee>();

   public Company() {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Введите оклад");
      baseIncome = scanner.nextInt();
      System.out.println("Введите прибыль компании");
      profit = scanner.nextInt();
   }

   public ArrayList<Employee> getProletarians() {
      return proletarians;
   }

   public double getBaseIncome() {
      return baseIncome;
   }

   public double getProfit() {
      return profit;
   }

   //Найм с клавиатуры
   public void hire(ArrayList<Employee> proletarians) {
      String FirstName, SecName;
      Scanner scanner = new Scanner(System.in);
      System.out.println("Введите имя");
      FirstName = scanner.nextLine();
      System.out.println("Введите фамилию");
      SecName = scanner.nextLine();
      for (int i = 0; i < proletarians.size(); i++) {
         if (FirstName.equals(proletarians.get(i).getFirstName())) {
            if (SecName.equals(proletarians.get(i).getSecName())) {
               this.proletarians.add(proletarians.get(i));
            }
         }
      }
   }

   public void fire(String FirsName, String SecName) {
      for (int j = 0;j < proletarians.size();j++) {
         boolean finder = this.proletarians.get(j).equals(new Employee(FirsName,SecName));
         if(finder) this.proletarians.remove(j);
      }
   }

   public void hireall(ArrayList<Employee> proletarians){
      this.proletarians.addAll(proletarians);
   }


}