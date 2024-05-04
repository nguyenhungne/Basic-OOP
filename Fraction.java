public class Fraction implements IFraction {
    private int num;
    private int den;

    public Fraction(int n, int d) {
        num = n;
        den = d;
    }

    public int numPart() {
        return num;
    }

    public int denPart() {
        return den;
    }

    public IFraction add(IFraction f) {
        int n = num * f.denPart() + f.numPart() * den;
        int d = den * f.denPart();
        return new Fraction(n, d);
    }

    public IFraction minus(IFraction f) {
        int n = num * f.denPart() - f.numPart() * den;
        int d = den * f.denPart();
        return new Fraction(n, d);
    }

    public IFraction times(IFraction f) {
        int n = num * f.numPart();
        int d = den * f.denPart();
        return new Fraction(n, d);
    }

    public void simplify() {
        int gcd = gcd(num, den);
        num /= gcd;
        den /= gcd;
    }

    private int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }
}
