package com.company;

public class Tester extends Thread {
    AtmSystem atmSystem = new AtmSystem();

    @Override
    public void run(){
        atmSystem.atms[0].withdraw(100);
        atmSystem.atms[0].deposit(200);
        for (Atm atm : atmSystem.atms) atm.stop();
        interrupt();
    }
}
