package ru.mirea;


import java.lang.reflect.Array;
import java.security.SecureRandom;
import java.util.*;

public class Number {

    Random r = new Random();

    private String alphas = "АВЕКМНОРСТУХ";
    private String digits = "1234567890";
    private List<String> bd = new ArrayList(Arrays.asList("111","222","333","444","555","666","777","888","999","000"));
    String numberValue;
    String awesomeValue;
    private String buf = "";
    public Number getNumber(){
          buf = "Х333ЕЛ";
          /* buf += alphas.charAt(r.nextInt(digits.length()));
       for (int i = 0; i < 3; i++) {
           buf += digits.charAt(r.nextInt(digits.length()));
       }

        for (int i = 0; i < 2; i++) {
            buf += alphas.charAt(r.nextInt(alphas.length()));
        } */
        numberValue = buf;
       return this;
    }
    public Number getAwesomeNumber(){
        buf = "";
        buf += alphas.charAt(r.nextInt(alphas.length()));

       buf += bd.get(r.nextInt(bd.size()));

        for (int i = 0; i < 2; i++) {
            buf += alphas.charAt(r.nextInt(alphas.length()));
        }

        awesomeValue = buf;
        return this;
    }


    public String getNumberValue() {
        return numberValue;
    }

    public String getAwesomeValue() {
        return awesomeValue;
    }
}

