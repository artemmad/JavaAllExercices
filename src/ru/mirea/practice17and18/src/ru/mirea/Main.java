package ru.mirea;

public class Main {

    public static void main(String[] args) {
        String macAddress = "aE:dC:cA:56:76:54";

        boolean res = macAddress.matches("[0-9a-fA-F]{2}(?:[:-][0-9a-fA-F]{2}){5}");
        if(res){
            System.out.println("Это мак-адресс");
        }
        else {
            System.out.println("Это не мак-адресс");
        }
    }
}
