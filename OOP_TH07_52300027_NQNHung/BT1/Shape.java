public abstract class Shape {
    protected String color;
    protected boolean filled;
    public Shape() {
        this.color = "";
    }
    public Shape(String color) {
        this.color = color;
    }
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }
    public abstract double getArea();
    public String getColor() {
        return this.color;
    }
    public void setColor(String color) {
        this.color = color;
    }
   }
   