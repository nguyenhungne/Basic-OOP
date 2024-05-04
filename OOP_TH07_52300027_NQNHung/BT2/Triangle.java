public class Triangle extends Shape {
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle() {
        super();
        sideA = sideB = sideC = 1.0;
    }

    public Triangle(double sideA, double sideB, double sideC, String color, boolean filled) {
        super(color, filled);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    // Getters and setters for sideA, sideB, and sideC
    // ...

    @Override
    public double getArea() {
        double s = (sideA + sideB + sideC) / 2;
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
    }

    @Override
    public double getPerimeter() {
        return sideA + sideB + sideC;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "sideA=" + sideA +
                ", sideB=" + sideB +
                ", sideC=" + sideC +
                ", color='" + getColor() + '\'' +
                ", filled=" + isFilled() +
                '}';
    }
}
