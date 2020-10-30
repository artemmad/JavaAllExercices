package ru.mirea;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) {
       /* Robot vasya = new Robot("Вася");
        vasya.startWalking();*/
        System.out.println("Available number of cores: " + Runtime.getRuntime().availableProcessors());

    }
}
