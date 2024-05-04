public class Main {
    public static void main(String[] args) {
        Fraction f1 = new Fraction(3, 4);
        Fraction f2 = new Fraction(2, 5);

        IFraction result = f1.add(f2);
        result.simplify();
        System.out.println("After addition: " + result.numPart() + "/" + result.denPart());

        result = f1.minus(f2);
        result.simplify();
        System.out.println("After subtraction: " + result.numPart() + "/" + result.denPart());

        result = f1.times(f2);
        result.simplify();
        System.out.println("After multiplication: " + result.numPart() + "/" + result.denPart());
    }
}