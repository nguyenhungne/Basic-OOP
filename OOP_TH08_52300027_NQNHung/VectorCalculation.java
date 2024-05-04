import java.util.Scanner;
import java.util.Vector;

public class VectorCalculation {
    private Vector<Integer> X;
    private Vector<Integer> Y;

    public VectorCalculation(int n) {
        X = new Vector<>(n);
        Y = new Vector<>(n);
    }

    public void addElementToX(int element) {
        X.add(element);
    }

    public void calculateY() {
        for (Integer x : X) {
            int y = 2 * x * x + 1; // f(X) = 2x^2 + 1
            Y.add(y);
        }
    }

    public void printY() {
        System.out.println("Vector Y sau khi tính toán:");
        for (Integer y : Y) {
            System.out.println(y);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào độ dài của vector X (n): ");
        int n = scanner.nextInt();

        VectorCalculation vectorCalculation = new VectorCalculation(n);

        System.out.println("Nhập các phần tử cho vector X:");
        for (int i = 0; i < n; i++) {
            System.out.print("Phần tử thứ " + (i + 1) + ": ");
            int element = scanner.nextInt();
            vectorCalculation.addElementToX(element);
        }

        vectorCalculation.calculateY();
        vectorCalculation.printY();

        scanner.close();
    }
}