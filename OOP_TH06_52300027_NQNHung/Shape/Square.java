public class Square extends Rectangle {
    Square() {}

    Square (double side) {
        super(side, side);
    }

    Square (double side, String color, boolean filled) {
        super(side, side, color, filled)
    }

    public double getSide() {
        return super.length;
    }

    public void setSide(double side) {
        super.setLength(side);
        super.setLength(side);
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
    }

    @Override
    public void setLength(double length) {
        super.setLength(length);
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
