package com.company.task8;

import com.company.task7.Dish;
import com.company.task7.Pan;
import com.company.task7.Plate;

import java.util.Scanner;

public class main8 {
    public static void main(String[] args){
    Furniture Sofa1= new Sofa(3000,"FurghuDesepticon");
    Furniture chair1= new Chair(100,"Apojgur");
    int k;
    Scanner scan=new Scanner(System.in);
    System.out.println("Выберите мебель");
    System.out.println("1.Диван: "+ ((Sofa)Sofa1).getName());
    System.out.println("2.Стул: "+ chair1.getName());
    k=scan.nextInt();
    if (k==1){
        System.out.println(((Sofa)Sofa1).getName()+" стоит "+ Sofa1.getCost());
        System.out.println("Чтобы купить нажмите 1");
    }
    else if (k==2){
        System.out.println((chair1).getName()+" стоит "+ chair1.getCost());
        System.out.println("Чтобы купить нажмите 1");
    }
    k=scan.nextInt();
    System.out.println("Вы купили, молодец");
    }
}
