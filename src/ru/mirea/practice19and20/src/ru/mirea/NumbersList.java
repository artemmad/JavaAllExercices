package ru.mirea;

import java.util.*;

public class NumbersList {

    private List<Number> Numbers = new ArrayList();
    private HashSet<String> numsHash = new HashSet<>();
    private Set<String> numsTree = new TreeSet<>();

    public void createTree() {
        numsTree.add(new Number().getNumber().getNumberValue());
    }

    public void addHash() {
        numsHash.add(new Number().getNumber().getNumberValue());
    }

    public void addElement() {
        Numbers.add(new Number().getNumber());
    }

    public void findHash(Scanner in) {
        long timerStart = System.nanoTime();
        long elapsedTime = System.nanoTime() - timerStart;
        for (String x : numsHash) {
            if (x.contains(in.nextLine())) {
                System.out.println("Номер есть в хэшах, время:" + elapsedTime + "\n");
            } else {
                System.out.println("Немає такого номера,время:" + elapsedTime + "\n");
            }
        }
    }

    public void findNumber(Scanner in){
        long timerStart = System.nanoTime();
        long elapsedTime = System.nanoTime() - timerStart;

        for (Number x: Numbers){
            if(x.getNumber().getNumberValue().contains(in.nextLine())){
                System.out.println("Номер есть в хэшах, время:" + elapsedTime + "\n");
            }
            else {
                System.out.println("Немає такого номера,время:"+ elapsedTime + "\n");
            }
        }
    }

    public void searchTree(Scanner in){
            long timerStart = System.nanoTime();
            long elapsedTime = System.nanoTime() - timerStart;

        for(String x : numsTree){
                if(x.contains(in.nextLine())){
                    System.out.println("номер есть в дереве, время:" + elapsedTime + "\n");
                }
                else {
                    System.out.println("Немає такого номера,время:"+ elapsedTime + "\n");
                }
            }
    }

}