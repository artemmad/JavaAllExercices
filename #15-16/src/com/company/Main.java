package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Выберите задание: 0 - #15, другое - #16.");
        if (new Scanner(System.in).nextInt() == 0) {
            Robot robot = new Robot();
            robot.start();
        }
        else {
            System.out.println("Провести тест? 0 - Да, другое - нет");
            if (new Scanner(System.in).nextInt() == 0) {
                Tester tester = new Tester();
                tester.start();
            }
            else {
                AtmSystem atmSystem = new AtmSystem();
            }
        }
    }
}
