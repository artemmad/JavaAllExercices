package com.company;

public class AtmSystem {
    public final Atm[] atms = new Atm[3];
    private int globalBalance;
    AtmSystem(){
        for (int i=0;i<3;i++){
            atms[i]=new Atm(this, i+1);
        }
        setGlobalBalance();
        for (Atm atm : atms) atm.start();
    }
    public synchronized void setGlobalBalance(){ //модиф synchronized не позволяет выполнять несколько изменений обзего баланса системы за раз
        int temp=0;
        for (Atm atm : atms) temp += atm.getLocalBalance();
        globalBalance=temp;
    }
    public int getGlobalBalance() {
        return globalBalance;
    }
    public void Log(int index, String operation, int amount, boolean succeed){
        if (succeed) System.out.println("ATM "+index+" "+operation+"ed "+ amount);
        else System.out.println("ATM "+index+" tried to "+operation+" "+ amount+". Transaction not completed");
        System.out.println("Total balance: "+getGlobalBalance());
        for (int i=0;i<3;i++){
            System.out.println("ATM "+atms[i].index+". Balance: "+atms[i].getLocalBalance());
        }
        System.out.println();
    }
}
