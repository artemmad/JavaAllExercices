package ru.mirea;


public class Main {

    public static void main(String[] args) {

        Number myNum = new Number();
        //System.out.println(myNum.getNumber().getNumberValue());
        //System.out.println(myNum.getAwesomeNumber().getAwesomeValue());

        NumbersList myNumList = new NumbersList();
        myNumList.addElement();
        for (Number s : myNumList.Numbers) {

                System.out.println(s.getAwesomeValue());
        }
    }
}
