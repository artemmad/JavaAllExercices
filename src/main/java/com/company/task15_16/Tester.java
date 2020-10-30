package com.company.task15_16;

public class Tester  {
    public static void main(String[] args) throws InterruptedException {
        Person person=new Person("Alex");
        ATM atm1=new ATM(person.getMyaccount());
        ATM atm2=new ATM(person.getMyaccount());
        ATM atm3=new ATM(person.getMyaccount());
        Thread childatm1 = new Thread(atm1,"atm1");
        Thread childatm2 = new Thread(atm2,"atm2");
        Thread childatm3 = new Thread(atm3,"atm3");
        childatm1.start();
        childatm2.start();
        childatm3.start();
    }
}
