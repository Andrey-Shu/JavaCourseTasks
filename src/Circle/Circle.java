package Circle;

public class Circle {
   private double radius;
   private String discription;

    public Circle(double radius, String discription) {
        this.radius = radius;
        this.discription = discription;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", discription='" + discription + '\'' +
                '}';
    }
}
