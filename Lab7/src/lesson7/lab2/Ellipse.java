package lesson7.lab2;

public class Ellipse implements ClosedCurve {

    private final double a;
    private final double E;

    public Ellipse(double a, double E) {
        this.a = a;
        this.E = E;
    }

    @Override
    public double computePerimeter() {
        return 4 * a * E;
    }
}
