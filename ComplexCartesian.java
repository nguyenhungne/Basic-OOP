public class ComplexCartesian {

    private double real;
    private double imag;

    public ComplexCartesian(double r, double i) { 
        real = r; 
        imag = i; 
    }

    public double realpart() {
        return real;
    }

    public double imagpart() {
        return imag;
    }

    public ComplexCartesian add(ComplexCartesian c) { 
        return new ComplexCartesian(real + c.realpart(), imag + c.imagpart());
    }

    public ComplexCartesian minus(ComplexCartesian c) {
        return new ComplexCartesian(real - c.realpart(), imag - c.imagpart());
    }

    public ComplexCartesian times(ComplexCartesian c) { 
        return new ComplexCartesian(real * c.realpart() - imag * c.imagpart(), imag * c.realpart() + real * c.imagpart());
    }
}