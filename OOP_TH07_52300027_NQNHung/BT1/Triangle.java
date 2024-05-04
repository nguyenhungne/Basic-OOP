public class Triangle extends Shape {
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle() {
        super();
        this.sideA = 0;
        this.sideB = 0;
        this.sideC = 0;
    }

    public Triangle(double sideA, double sideB, double sideC, String color) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public double getArea() {
        double s = (this.sideA + this.sideB + this.sideC) / 2.0;
        return Math.sqrt(s * (s - this.sideA) * (s - this.sideB) * (s - this.sideC));
    }

    public double getPerimeter() {
        return this.sideA + this.sideB + this.sideC;
    }

    @Override
    public String toString() {
        return "Triangle{" + "sideA=" + sideA +
                ", sideB=" + sideB +
                ", sideC=" + sideC +
                ", color=" + color + '}';
    }
}
