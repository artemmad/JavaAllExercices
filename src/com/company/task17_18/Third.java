package com.company.task17_18;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Third {
    public void check() {
        String regex = "([1-9]\\d+[.]?\\d{0,2})([ ])([U][S][D]|[R][U][R]|[E][U])";
        String s = "30.06 USD 50.30 RUR 60 CHF 23.78 USD 22 UDD 0.002 USD";
        Pattern p1 = Pattern.compile(regex);
        Matcher m1 = p1.matcher(s);
        while (m1.find()) {
            System.out.println(m1.group());
        }
    }
}
