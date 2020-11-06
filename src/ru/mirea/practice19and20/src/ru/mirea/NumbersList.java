package ru.mirea;

import java.util.ArrayList;
import java.util.List;

public class NumbersList {

    public List<Number> Numbers = new ArrayList();

    public void addElement() {
        Numbers.add(new Number().getAwesomeNumber());
        Numbers.add(new Number().getAwesomeNumber());
        Numbers.add(new Number().getNumber());
    }
}

