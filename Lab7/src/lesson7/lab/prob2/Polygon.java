package lesson7.lab.prob2;

public interface Polygon extends ClosedCurve {

    double[] getLengths();

    @Override
    public default double computePerimeter() {
        double perimeter = 0;
        
        for (double length : getLengths()) {
            perimeter += length;
        }

        return perimeter;
    }
}