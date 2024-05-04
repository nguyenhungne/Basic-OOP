public interface Complex {
    double realpart();
    double imagpart();
    double mag();
    double angle();
    void add(Complex c);
    void minus(Complex c);
    void times(Complex c);
}