package ru.mirea;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Number myNum = new Number();
        System.out.println(myNum.getNumber().getNumberValue());
        //System.out.println(myNum.getAwesomeNumber().getAwesomeValue());
        Scanner scan = new Scanner(System.in);
        NumbersList myNumList = new NumbersList();
        myNumList.addElement();
        for (Number s : myNumList.Numbers) {

                System.out.println(s.getAwesomeValue());
                if (s.getNumber().getNumberValue().contains(scan.nextLine())){
                    System.out.println("Такой номер есть\n");
                }
        }
    }
}
