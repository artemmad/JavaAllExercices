package ru.mirea;

import ru.mirea.ATM.Sentenses;
import ru.mirea.ATM.bankomat;

public class Tester  {
    public static void main(String[] args) throws InterruptedException {
        Sentenses words = new Sentenses();
        Person person=new Person(words.getSens(3));
        bankomat atm1=new bankomat(person.getNewAc());
        bankomat atm2=new bankomat(person.getNewAc());
        bankomat atm3=new bankomat(person.getNewAc());
        Thread cb1 = new Thread(atm1,words.getSens(4));
        Thread cb2 = new Thread(atm2,words.getSens(5));
        Thread cb3 = new Thread(atm3,words.getSens(6));
        cb3.start();
        cb2.start();
        cb1.start();
    }
}
