package ru.mirea;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class NumbersList {

    private long timerStart = System.nanoTime();
    private long curTime = System.nanoTime() - timerStart;
    public List<Number> Numbers = new ArrayList();
    public HashSet<String> numsHash = new HashSet<String>();

    public void addHash(){
        numsHash.add(new Number().getAwesomeNumber().getAwesomeValue());
        numsHash.add(new Number().getAwesomeNumber().getAwesomeValue());
        numsHash.add(new Number().getAwesomeNumber().getAwesomeValue());
    }

    public void addElement() {
        Numbers.add(new Number().getAwesomeNumber());
        Numbers.add(new Number().getAwesomeNumber());
        Numbers.add(new Number().getNumber());
    }

   public void findNumber(Scanner in){
        for (Number x :Numbers) {
            if (x.getNumber().getNumberValue().contains(in.nextLine())) {
                System.out.println("Такой номер есть,время: "+ curTime+ "нс\n");
            }
            else{System.out.println("Немає такого номера,время: " + curTime+ "нс\n");}
        }

    }
    public void findHash(Scanner in){
        for (String x :numsHash) {
                if (x.contains(in.nextLine())){
                    System.out.println("Такой номер есть,время: "+ curTime+ "нс\n");
                }
                else{System.out.println("Немає такого номера,время: " + curTime+ "нс\n");}
            }

        }


}

