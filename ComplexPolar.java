class ComplexPolar implements Complex {
    private double mag;
    private double ang;

    public ComplexPolar(double m, double a) {
        mag = m;
        ang = a;
    }

    public double realpart() {
        return mag * Math.cos(ang);
    }

    public double imagpart() {
        return mag * Math.sin(ang);
    }

    public double mag() {
        return mag;
    }

    public double angle() {
        return ang;
    }

    public void add(Complex c) { 
        double real = this.realpart() + c.realpart();
        double imag = this.imagpart() + c.imagpart();
        mag = Math.sqrt(real * real + imag * imag);
        if (real != 0) {
            if (real < 0)
                ang = (Math.PI + Math.atan(imag / real));
            else
                ang = Math.atan(imag / real);
        } else if (imag == 0)
            ang = 0;
        else if (imag > 0)
            ang = Math.PI / 2;
        else
            ang = -Math.PI / 2;
    }

    public void minus(Complex c) { 
        double real = mag * Math.cos(ang) - c.realpart();
        double imag = mag * Math.sin(ang) - c.imagpart();
        mag = Math.sqrt(real * real + imag * imag);
        if (real != 0) {
            if (real < 0)
                ang = (Math.PI + Math.atan(imag / real));
            else
                ang = Math.atan(imag / real);
        } else if (imag == 0)
            ang = 0;
        else if (imag > 0)
            ang = Math.PI / 2;
        else
            ang = -Math.PI / 2;
    }

    public void times(Complex c) {
        mag *= c.mag();
        ang += c.angle();
    }

    public String toString() {
        if (imagpart() == 0)
            return (realpart() + "");
        else if (imagpart() < 0)
            return (realpart() + "" + imagpart() + "i");
        else
            return (realpart() + "+" + imagpart() + "i");
    }
}
