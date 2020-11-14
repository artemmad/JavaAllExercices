package ru.mirea;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Number myNum = new Number();
        System.out.println(myNum.getNumber().getNumberValue());
        //System.out.println(myNum.getAwesomeNumber().getAwesomeValue());
        Scanner scan = new Scanner(System.in);
        NumbersList myNumList = new NumbersList();
        myNumList.addHash();
        //myNumList.addElement();
        //myNumList.createTree();
        myNumList.findHash(scan);
        //myNumList.searchTree(scan);
        //myNumList.findNumber(scan);
    }
}
