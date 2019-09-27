package AbstractTask;

public class SquareClass extends ShapeAbsClass {
    private double side;

    public SquareClass(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        double p = side * side;
        return p;
    }
}
