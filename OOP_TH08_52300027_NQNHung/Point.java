import java.util.ArrayList;
import java.lang.Math;

public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return this.x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return this.y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double distanceFromOrigin() {
        return Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2));
    }

    public ArrayList<Point> checkListPointsInCircle1(ArrayList<Point> points) {
        ArrayList<Point> pointsInside = new ArrayList<>();
        for (Point point : points) {
            if (point.distanceFromOrigin() <= 1) {
                pointsInside.add(point);
            }
        }
        return pointsInside;
    }

    @Override
    public String toString() {
        return "(" + this.x + ", " + this.y + ")";
    }

    public static void main(String[] args) {
        ArrayList<Point> points = new ArrayList<>();
        points.add(new Point(0.5, 0.5));
        points.add(new Point(1, 1));
        points.add(new Point(-0.5, -0.5));
        points.add(new Point(-1, -1));

        ArrayList<Point> pointsInside = new Point(1, 2).checkListPointsInCircle1(points);

        System.out.println("Points inside the circle:");
        for (Point point : pointsInside) {
            System.out.println(point);
        }
    }
}