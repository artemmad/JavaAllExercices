package com.company.task17_18;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class First {
    public void check(){
        String right,in;
        right="abcdefghijklmnopqrstuv18340";
        System.out.println("Введите строку");
        Scanner scanner = new Scanner(System.in);
        in=scanner.nextLine();
        Pattern pattern = Pattern.compile(right);
        Matcher matcher = pattern.matcher(in);
        if(matcher.matches()){
            System.out.println("true");
        }
        else System.out.println("false");
    }
}
