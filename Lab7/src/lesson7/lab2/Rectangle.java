package lesson7.lab2;

public class Rectangle implements Polygon {

    private final double length;
    private final double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double[] getLengths() {
        return new double[]{length, width};
    }

}
