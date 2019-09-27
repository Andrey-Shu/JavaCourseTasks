package AbstractTask;

public class AbstractMainClass {
    public static void main(String[] args) {
        ShapeAbsClass circleClass = new CircleClass(4);
        ShapeAbsClass squareClass = new SquareClass(5);
        ShapreService shapreService = new ShapreService();
        double circleArea = shapreService.getArea(circleClass);
        System.out.println(circleArea);
       double squareArea =  shapreService.getArea(squareClass);
        System.out.println(squareArea);

    }
}
