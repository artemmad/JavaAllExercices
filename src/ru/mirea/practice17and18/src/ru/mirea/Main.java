package ru.mirea;

public class Main {

    public static void main(String[] args) {
        String macAddress = "aE:dC:cA:56:76:54";
        String valuta = "0.064 UDD";
        boolean res = macAddress.matches("[0-9a-fA-F]{2}(?:[:-][0-9a-fA-F]{2}){5}");
        boolean res2 = valuta.matches("(\\d*)|(\\.\\d*)|(RUR|EU|USD){1}");
        if(res){
            System.out.println("Это мак-адресс");
        }
        else {
            System.out.println("Это не мак-адресс");
        }

        if(res2){
            System.out.println("Это валюта");
        }
        else {
            System.out.println("Это не валюта");
        }
    }
}
