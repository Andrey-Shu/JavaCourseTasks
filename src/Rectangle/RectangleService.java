package Rectangle;

public class RectangleService {
    public static int regtangleSquare(Rectangle rectangle) {
        int square = rectangle.getSideA() * rectangle.getSideB();
        return square;
    }

    public static int regtanglePerim(Rectangle rectangle) {
        int square = (rectangle.getSideA() * rectangle.getSideB()) * 2;
        return square;
    }

    public static double diagonalRectangle(Rectangle rectangle) {
        double diagonal = Math.sqrt((rectangle.getSideA() * rectangle.getSideA()) + (rectangle.getSideB() * rectangle.getSideB()));
        return diagonal;
    }
}
