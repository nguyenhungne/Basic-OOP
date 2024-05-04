public class MainTest {
    public static void main(String[] args) {
        ComplexPolar cp1 = new ComplexPolar(5, Math.PI / 4);
        ComplexPolar cp2 = new ComplexPolar(3, Math.PI / 3);

        cp1.add(cp2);
        System.out.println("After addition: " + cp1.toString());

        cp1 = new ComplexPolar(5, Math.PI / 4);
        System.out.println("After subtraction: " + cp1.toString());

        cp1 = new ComplexPolar(5, Math.PI / 4);
        cp1.times(cp2);
        System.out.println("After multiplication: " + cp1.toString());
    }
}