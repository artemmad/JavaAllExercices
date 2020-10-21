package com.company;

import java.util.Random;

public class Atm extends Thread {
    public final AtmSystem atmSystem;
    public final int index;
    private int localBalance = 1000;

    public int getLocalBalance() {
        return localBalance;
    }
    public Atm(AtmSystem atmSystem, int index){
        this.atmSystem=atmSystem;
        this.index=index;
    }
    public void deposit(int amount){
        localBalance+=amount;
        atmSystem.setGlobalBalance();
        atmSystem.Log(index, "deposit", amount, true);
    }
    //так как в банкомате может быть меньше денег, чем хотят вывести, ставим доп. логику проверки разницы баланса и желаемого вовода
    public void withdraw(int amount){
        if (localBalance-amount>=0) {
            localBalance-=amount;
            atmSystem.setGlobalBalance();
            atmSystem.Log(index, "withdraw", amount, true);
        }
        else atmSystem.Log(index, "withdraw", amount, false);
    }

    public void run() {
        while (true) {
            try {
                sleep(new Random().nextInt(4000) + 1000);
                if (new Random().nextInt(100)%2==0) withdraw(new Random().nextInt(100) * 100 + 100);
                else deposit(new Random().nextInt(100) * 100 + 100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
