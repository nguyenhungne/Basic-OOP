class Calculator {
    public double divide(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("divide by zero");
        }
        return a / (double) b;
    }

    public int multiply(int a, int b) throws NumberOutOfRangeException {
        if (a < -1000 || a > 1000 || b < -1000 || b > 1000) {
            throw new NumberOutOfRangeException("Number is outside the computation");
        }
        return a * b;
    }
}

class NumberOutOfRangeException extends Exception {
    public NumberOutOfRangeException(String message) {
        super(message);
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        try {
            System.out.println(calc.divide(10, 0));
        } catch (ArithmeticException e) {
            System.err.println(e.getMessage());
        }

        try {
            System.out.println(calc.multiply(2000, 5));
        } catch (NumberOutOfRangeException e) {
            System.err.println(e.getMessage());
        }
    }
}

