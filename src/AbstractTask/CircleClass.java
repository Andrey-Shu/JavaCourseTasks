package AbstractTask;

public class CircleClass extends ShapeAbsClass {

    private double radius;

    public CircleClass(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        double p = Math.PI * radius * radius;
        return p;
    }
}
