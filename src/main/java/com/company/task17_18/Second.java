package com.company.task17_18;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Second {
    public void check(){
        String regex,in;
        regex="([a-f]+[A-F]+:){3}+([0-9]{2}+:){2}+[0-9]{2}";
        System.out.println("Введите строку");
        Scanner scanner = new Scanner(System.in);
        in=scanner.nextLine();
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(in);
        if(matcher.matches()){
            System.out.println("true");
        }
        else System.out.println("false");
    }
}
