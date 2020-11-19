package com.company.task20_21.complexnumbers;

public class Creating implements ComplexNumbersFabrika {
    @Override
    public ComplexNumber create() {
        double re = 3;
        double im = 2;
        return new ComplexNumber(re,im);
    }
}
