public class RegularPolygon {
    private String name;
    private int edgeAmount;
    private double edgeLength;

    public RegularPolygon() {
        name="";
        edgeAmount=0;
        edgeLength=1;
    }

    public RegularPolygon(String name, int edgeAmount,double edgeLength) {
        this.name = name;
        this.edgeAmount = edgeAmount;
        this.edgeLength = edgeLength;
    }

    public RegularPolygon(String name, int edgeAmount) {
        this.name = name;
        this.edgeAmount = edgeAmount;
        this.edgeLength = 1;
    }

    public RegularPolygon(RegularPolygon polygon) {
        this.name = polygon.name;
        this.edgeAmount = polygon.edgeAmount;
        this.edgeLength = polygon.edgeLength;
    }

    public String getName() {
        return this.name;
    }

    public int getEdgeAmount() {
        return this.edgeAmount;
    }

    public double getEdgeLength() {
        return this.edgeLength;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEdgeAmount(int edgeAmount) {
        this.edgeAmount = edgeAmount;
    }

    public void setEdgeLength(double edgeLength) {
        this.edgeLength = edgeLength;
    }

    public String getPolygon() {
        switch (this.edgeAmount) {
            case 3:
                return "Triangle";
            case 4:
                return "Quadrangle";
            case 5:
                return "Pentagon";
            case 6:
                return "Hexagon";
            default:
                return "Polygon has the number of edges greater than 6";
        }
    }

    public double getPerimeter() {
        return this.edgeAmount * this.edgeLength;
    }

    public double getArea() {
        double a;
        switch (this.edgeAmount) {
            case 3:
                a = 0.433;
                break;
            case 4:
                a = 1;
                break;
            case 5:
                a = 1.72;
                break;
            case 6:
                a = 2.595;
                break;
            default:
                return -1;
        }
        return Math.pow(this.edgeLength, 2) * a * this.edgeAmount;
    }
    @Override
    public String toString() {
        return this.name + " - " + this.getPolygon() + " - " + this.getArea();
    }
}
