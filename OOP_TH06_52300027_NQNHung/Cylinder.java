public class Cylinder extends Circle {
    protected double height = 1.0;

    Cylinder() {};
    Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    Cylinder(double radius, double height, String color) {
        super(radius, color);
        this.height = height;
    }
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return getArea() * height;
    }

    @Override
    public String toString() {
        return "Cylinder[radius=" + radius + ",height=" + height + ",color=" + color + "]";
    }
}
