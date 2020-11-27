package com.company.task21_22.complexnumbers;

public class ComplexNumber implements CompNumber {
    private double re;
    private double im;

    public ComplexNumber(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public double getRe() {
        return re;
    }

    public double getIm() {
        return im;
    }

    public double getModule() {
        return Math.sqrt(this.re * this.re + this.im * this.im);
    }

    public static ComplexNumber sum(ComplexNumber cn1, ComplexNumber cn2) {
        return new ComplexNumber(cn1.getRe() + cn2.getRe(), cn1.getIm() + cn2.getIm());
    }

    public static ComplexNumber multiply(ComplexNumber cn1, ComplexNumber cn2) {
        return new ComplexNumber(cn1.getRe() * cn2.getRe() - cn1.getIm() * cn2.getIm(), cn1.getRe() * cn2.getIm() + cn1.getIm() * cn2.getRe());
    }

    public static ComplexNumber subtract(ComplexNumber cn1, ComplexNumber cn2) {
        return new ComplexNumber(cn1.getRe() - cn2.getRe(), cn1.getIm() - cn2.getIm());
    }

    public static ComplexNumber divide(ComplexNumber cn1, ComplexNumber cn2) {
        ComplexNumber temp = new ComplexNumber(cn2.getRe(), (-1) * cn2.getIm());
        temp = ComplexNumber.multiply(cn1, temp);
        double denominator = cn2.getRe() * cn2.getRe() + cn2.getIm() * cn2.getIm();
        return new ComplexNumber(temp.getRe() / denominator, temp.getIm() / denominator);
    }


    public String sign() {
        if (im > 0) return " + ";
        else return " - ";
    }

    @Override
    public String toString() {
        String string;
        if (im == 1 || im == -1) {
            if (re == 0) {
                string = sign() + "i";
            } else {
                string = Double.toString(re) + sign() + "i";
            }
        } else {
            string = Double.toString(re) + sign() + Double.toString(Math.abs(im)) + "i";
        }
        return string;
    }
}
