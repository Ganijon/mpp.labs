package lesson7.lab2;

public interface Polygon extends ClosedCurve {

    double[] getLengths();

    public default double ComputePerimeter() {
        double perimeter = 0;

        for (double length : getLengths()) {
            perimeter += length;
        }

        return perimeter;
    }
}
