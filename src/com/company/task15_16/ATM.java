package com.company.task15_16;

import java.util.Enumeration;
import java.util.Random;

public class ATM implements Runnable{
    private account ac1;
    private boolean done;

    enum Operation{
        WITHDRAWL,
        REPLENISHMENT
    }

    public ATM(account ac1) {
        this.ac1 = ac1;
    }

    public synchronized void withdrawal(double summ){
            if (ac1.getBalance()<0){
                System.out.println("Снятие невозможно");
            }
            else if (ac1.getBalance()-summ<0) System.out.println("Снятие невозможно");
            else {
                ac1.setBalance(ac1.getBalance()-summ);
                System.out.println(Thread.currentThread().getName());
                System.out.println("Баланс после снятия:"+(ac1.getBalance()));
            }

    }

    public synchronized void replenisment(double summ){
       ac1.setBalance(ac1.getBalance()+summ);
        System.out.println(Thread.currentThread().getName());
        System.out.println("Баланс после пополнения:"+(ac1.getBalance()));
    }
    private synchronized void choose() {
        Random random = new Random();
        int i = 0;
        i = random.nextInt(2) + 1;
        if (i == 1) withdrawal(random.nextDouble());
        else replenisment(random.nextDouble());
    }
    @Override
    public  void run() {
            while (true) {
                Random random = new Random();
                try {
                    int k= random.nextInt(10000)+1;
                    if(k<0) k=k*(-1);
                    Thread.currentThread().sleep(k);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
              choose();

        }
    }
}
