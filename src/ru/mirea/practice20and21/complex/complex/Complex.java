package complex;

public class Complex implements ComNum {
    private double i;
    private double j;

    public Complex(double i, double j) {
        this.i = i;
        this.j = j;
    }

    public double Re() {
        return i;
    }

    public double Im() {
        return j;
    }

    public double Mod() {
        return Math.sqrt(this.i * this.i + this.j * this.j);
    }

    public static ComNum sum(ComNum cn1, ComNum cn2) {
        return new Complex(cn1.Re() + cn2.Re(), cn1.Im() + cn2.Im());
    }

    public static ComNum mul(ComNum cn1, ComNum cn2) {
        return new Complex(cn1.Re() * cn2.Re() - cn1.Im() * cn2.Im(), cn1.Re() * cn2.Im() + cn1.Im() * cn2.Re());
    }

    public static ComNum sub(ComNum cn1, ComNum cn2) {
        return new Complex(cn1.Re() - cn2.Re(), cn1.Im() - cn2.Im());
    }

    public static ComNum div(ComNum cn1, ComNum cn2) {
        ComNum z = new Complex(cn2.Re(), (-1) * cn2.Im());
        z = Complex.mul(cn1, z);
        double denominator = cn2.Re() * cn2.Re() + cn2.Im() * cn2.Im();
        return new Complex(z.Re() / denominator, z.Im() / denominator);
    }


    public String sig() {
        if (j > 0) return " + ";
        else return " - ";
    }

    @Override
    public String toString() {
        String string;
        if (j == 1 || j == -1) {
            if (i == 0) {
                string = sig() + "i";
            } else {
                string = Double.toString(i) + sig() + "i";
            }
        } else {
            string = Double.toString(i) + sig() + Double.toString(Math.abs(j)) + "i";
        }
        return string;
    }
}
