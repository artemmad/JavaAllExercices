package ru.mirea;


import java.security.SecureRandom;
import java.util.Objects;
import java.util.Random;

public class Number {

    Random r = new Random();

    private String alphas = "АВЕКМНОРСТУХ";
    private String digits = "0123456789";
    private String buf = "";
    public String getNumber(){
          buf += alphas.charAt(r.nextInt(alphas.length()));
       for (int i = 0; i < 3; i++) {
           buf += digits.charAt(r.nextInt(digits.length()));
       }

        for (int i = 0; i < 2; i++) {
            buf += alphas.charAt(r.nextInt(alphas.length()));
        }

       return buf;
    }
}

