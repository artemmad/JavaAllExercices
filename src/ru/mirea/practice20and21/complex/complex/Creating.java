package complex;

import complex.ComNum;

public class Creating implements ComplexNumbersFabrika {
    @Override
    public ComNum create() {
        double i = 3;
        double j = 2;
        return new Complex(i, j) {
        };
    }
}